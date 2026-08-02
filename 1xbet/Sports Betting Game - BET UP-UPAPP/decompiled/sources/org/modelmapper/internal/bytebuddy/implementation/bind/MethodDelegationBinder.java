package org.modelmapper.internal.bytebuddy.implementation.bind;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.bind.annotation.BindingPriority;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.Removal;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.Assigner;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodInvocation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodReturn;
import org.modelmapper.internal.bytebuddy.utility.CompoundList;

/* loaded from: classes4.dex */
public interface MethodDelegationBinder {
    Record compile(MethodDescription methodDescription);

    public interface Record {
        MethodBinding bind(Implementation.Target target, MethodDescription methodDescription, TerminationHandler terminationHandler, MethodInvoker methodInvoker, Assigner assigner);

        public enum Illegal implements Record {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder.Record
            public MethodBinding bind(Implementation.Target target, MethodDescription methodDescription, TerminationHandler terminationHandler, MethodInvoker methodInvoker, Assigner assigner) {
                return MethodBinding.Illegal.INSTANCE;
            }
        }
    }

    public interface MethodInvoker {
        StackManipulation invoke(MethodDescription methodDescription);

        public enum Simple implements MethodInvoker {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker
            public StackManipulation invoke(MethodDescription methodDescription) {
                return MethodInvocation.invoke(methodDescription);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Virtual implements MethodInvoker {
            private final TypeDescription typeDescription;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.typeDescription.equals(((Virtual) obj).typeDescription);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeDescription.hashCode();
            }

            public Virtual(TypeDescription typeDescription) {
                this.typeDescription = typeDescription;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder.MethodInvoker
            public StackManipulation invoke(MethodDescription methodDescription) {
                return MethodInvocation.invoke(methodDescription).virtual(this.typeDescription);
            }
        }
    }

    public interface ParameterBinding<T> extends StackManipulation {
        T getIdentificationToken();

        public enum Illegal implements ParameterBinding<Void> {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public boolean isValid() {
                return false;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding
            public Void getIdentificationToken() {
                throw new IllegalStateException("An illegal binding does not define an identification token");
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                throw new IllegalStateException("An illegal parameter binding must not be applied");
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Anonymous implements ParameterBinding<Object> {

            @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.IGNORE)
            private final Object anonymousToken = new Object();
            private final StackManipulation delegate;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.delegate.equals(((Anonymous) obj).delegate);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.delegate.hashCode();
            }

            public Anonymous(StackManipulation stackManipulation) {
                this.delegate = stackManipulation;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding
            public Object getIdentificationToken() {
                return this.anonymousToken;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public boolean isValid() {
                return this.delegate.isValid();
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                return this.delegate.apply(methodVisitor, context);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Unique<T> implements ParameterBinding<T> {
            private final StackManipulation delegate;
            private final T identificationToken;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Unique unique = (Unique) obj;
                return this.identificationToken.equals(unique.identificationToken) && this.delegate.equals(unique.delegate);
            }

            public int hashCode() {
                return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.identificationToken.hashCode()) * 31) + this.delegate.hashCode();
            }

            public Unique(StackManipulation stackManipulation, T t) {
                this.delegate = stackManipulation;
                this.identificationToken = t;
            }

            public static <S> Unique<S> of(StackManipulation stackManipulation, S s) {
                return new Unique<>(stackManipulation, s);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder.ParameterBinding
            public T getIdentificationToken() {
                return this.identificationToken;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public boolean isValid() {
                return this.delegate.isValid();
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                return this.delegate.apply(methodVisitor, context);
            }
        }
    }

    public interface MethodBinding extends StackManipulation {
        MethodDescription getTarget();

        Integer getTargetParameterIndex(Object obj);

        public enum Illegal implements MethodBinding {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public boolean isValid() {
                return false;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding
            public Integer getTargetParameterIndex(Object obj) {
                throw new IllegalStateException("Method is not bound");
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding
            public MethodDescription getTarget() {
                throw new IllegalStateException("Method is not bound");
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                throw new IllegalStateException("Cannot delegate to an unbound method");
            }
        }

        public static class Builder {
            private final MethodDescription candidate;
            private final MethodInvoker methodInvoker;
            private final List<StackManipulation> parameterStackManipulations;
            private final LinkedHashMap<Object, Integer> registeredTargetIndices = new LinkedHashMap<>();
            private int nextParameterIndex = 0;

            public Builder(MethodInvoker methodInvoker, MethodDescription methodDescription) {
                this.methodInvoker = methodInvoker;
                this.candidate = methodDescription;
                this.parameterStackManipulations = new ArrayList(methodDescription.getParameters().size());
            }

            public boolean append(ParameterBinding<?> parameterBinding) {
                this.parameterStackManipulations.add(parameterBinding);
                LinkedHashMap<Object, Integer> linkedHashMap = this.registeredTargetIndices;
                Object identificationToken = parameterBinding.getIdentificationToken();
                int i = this.nextParameterIndex;
                this.nextParameterIndex = i + 1;
                return linkedHashMap.put(identificationToken, Integer.valueOf(i)) == null;
            }

            public MethodBinding build(StackManipulation stackManipulation) {
                if (this.candidate.getParameters().size() != this.nextParameterIndex) {
                    throw new IllegalStateException("The number of parameters bound does not equal the target's number of parameters");
                }
                MethodDescription methodDescription = this.candidate;
                return new Build(methodDescription, this.registeredTargetIndices, this.methodInvoker.invoke(methodDescription), this.parameterStackManipulations, stackManipulation);
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static class Build implements MethodBinding {
                private final StackManipulation methodInvocation;
                private final List<StackManipulation> parameterStackManipulations;
                private final Map<?, Integer> registeredTargetIndices;
                private final MethodDescription target;
                private final StackManipulation terminatingStackManipulation;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Build build = (Build) obj;
                    return this.target.equals(build.target) && this.registeredTargetIndices.equals(build.registeredTargetIndices) && this.methodInvocation.equals(build.methodInvocation) && this.parameterStackManipulations.equals(build.parameterStackManipulations) && this.terminatingStackManipulation.equals(build.terminatingStackManipulation);
                }

                public int hashCode() {
                    return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.target.hashCode()) * 31) + this.registeredTargetIndices.hashCode()) * 31) + this.methodInvocation.hashCode()) * 31) + this.parameterStackManipulations.hashCode()) * 31) + this.terminatingStackManipulation.hashCode();
                }

                protected Build(MethodDescription methodDescription, Map<?, Integer> map, StackManipulation stackManipulation, List<StackManipulation> list, StackManipulation stackManipulation2) {
                    this.target = methodDescription;
                    this.registeredTargetIndices = new HashMap(map);
                    this.methodInvocation = stackManipulation;
                    this.parameterStackManipulations = new ArrayList(list);
                    this.terminatingStackManipulation = stackManipulation2;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
                public boolean isValid() {
                    boolean z = this.methodInvocation.isValid() && this.terminatingStackManipulation.isValid();
                    Iterator<StackManipulation> it = this.parameterStackManipulations.iterator();
                    while (z && it.hasNext()) {
                        z = it.next().isValid();
                    }
                    return z;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding
                public Integer getTargetParameterIndex(Object obj) {
                    return this.registeredTargetIndices.get(obj);
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder.MethodBinding
                public MethodDescription getTarget() {
                    return this.target;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
                public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                    return new StackManipulation.Compound((List<? extends StackManipulation>) CompoundList.of((List) this.parameterStackManipulations, Arrays.asList(this.methodInvocation, this.terminatingStackManipulation))).apply(methodVisitor, context);
                }
            }
        }
    }

    public interface BindingResolver {
        MethodBinding resolve(AmbiguityResolver ambiguityResolver, MethodDescription methodDescription, List<MethodBinding> list);

        public enum Default implements BindingResolver {
            INSTANCE;

            private static final int LEFT = 0;
            private static final int ONLY = 0;
            private static final int RIGHT = 1;

            @Override // org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver
            public MethodBinding resolve(AmbiguityResolver ambiguityResolver, MethodDescription methodDescription, List<MethodBinding> list) {
                return doResolve(ambiguityResolver, methodDescription, new ArrayList(list));
            }

            private MethodBinding doResolve(AmbiguityResolver ambiguityResolver, MethodDescription methodDescription, List<MethodBinding> list) {
                int size = list.size();
                if (size == 1) {
                    return list.get(0);
                }
                if (size == 2) {
                    MethodBinding methodBinding = list.get(0);
                    MethodBinding methodBinding2 = list.get(1);
                    int i = AnonymousClass1.$SwitchMap$net$bytebuddy$implementation$bind$MethodDelegationBinder$AmbiguityResolver$Resolution[ambiguityResolver.resolve(methodDescription, methodBinding, methodBinding2).ordinal()];
                    if (i == 1) {
                        return methodBinding;
                    }
                    if (i == 2) {
                        return methodBinding2;
                    }
                    if (i == 3 || i == 4) {
                        throw new IllegalArgumentException("Cannot resolve ambiguous delegation of " + methodDescription + " to " + methodBinding + " or " + methodBinding2);
                    }
                    throw new AssertionError();
                }
                MethodBinding methodBinding3 = list.get(0);
                MethodBinding methodBinding4 = list.get(1);
                int i2 = AnonymousClass1.$SwitchMap$net$bytebuddy$implementation$bind$MethodDelegationBinder$AmbiguityResolver$Resolution[ambiguityResolver.resolve(methodDescription, methodBinding3, methodBinding4).ordinal()];
                if (i2 == 1) {
                    list.remove(1);
                    return doResolve(ambiguityResolver, methodDescription, list);
                }
                if (i2 == 2) {
                    list.remove(0);
                    return doResolve(ambiguityResolver, methodDescription, list);
                }
                if (i2 == 3 || i2 == 4) {
                    list.remove(1);
                    list.remove(0);
                    MethodBinding doResolve = doResolve(ambiguityResolver, methodDescription, list);
                    int i3 = AnonymousClass1.$SwitchMap$net$bytebuddy$implementation$bind$MethodDelegationBinder$AmbiguityResolver$Resolution[ambiguityResolver.resolve(methodDescription, methodBinding3, doResolve).merge(ambiguityResolver.resolve(methodDescription, methodBinding4, doResolve)).ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            return doResolve;
                        }
                        if (i3 != 3 && i3 != 4) {
                            throw new AssertionError();
                        }
                    }
                    throw new IllegalArgumentException("Cannot resolve ambiguous delegation of " + methodDescription + " to " + methodBinding3 + " or " + methodBinding4);
                }
                throw new IllegalStateException("Unexpected amount of targets: " + list);
            }
        }

        public enum Unique implements BindingResolver {
            INSTANCE;

            private static final int ONLY = 0;

            @Override // org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver
            public MethodBinding resolve(AmbiguityResolver ambiguityResolver, MethodDescription methodDescription, List<MethodBinding> list) {
                if (list.size() == 1) {
                    return list.get(0);
                }
                throw new IllegalStateException(methodDescription + " allowed for more than one binding: " + list);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class StreamWriting implements BindingResolver {
            private final BindingResolver delegate;
            private final PrintStream printStream;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                StreamWriting streamWriting = (StreamWriting) obj;
                return this.delegate.equals(streamWriting.delegate) && this.printStream.equals(streamWriting.printStream);
            }

            public int hashCode() {
                return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.delegate.hashCode()) * 31) + this.printStream.hashCode();
            }

            public StreamWriting(BindingResolver bindingResolver, PrintStream printStream) {
                this.delegate = bindingResolver;
                this.printStream = printStream;
            }

            public static BindingResolver toSystemOut() {
                return toSystemOut(Default.INSTANCE);
            }

            public static BindingResolver toSystemOut(BindingResolver bindingResolver) {
                return new StreamWriting(bindingResolver, System.out);
            }

            public static BindingResolver toSystemError() {
                return toSystemError(Default.INSTANCE);
            }

            public static BindingResolver toSystemError(BindingResolver bindingResolver) {
                return new StreamWriting(bindingResolver, System.err);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder.BindingResolver
            public MethodBinding resolve(AmbiguityResolver ambiguityResolver, MethodDescription methodDescription, List<MethodBinding> list) {
                MethodBinding resolve = this.delegate.resolve(ambiguityResolver, methodDescription, list);
                this.printStream.println("Binding " + methodDescription + " as delegation to " + resolve.getTarget());
                return resolve;
            }
        }
    }

    /* renamed from: org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$net$bytebuddy$implementation$bind$MethodDelegationBinder$AmbiguityResolver$Resolution;

        static {
            int[] iArr = new int[AmbiguityResolver.Resolution.values().length];
            $SwitchMap$net$bytebuddy$implementation$bind$MethodDelegationBinder$AmbiguityResolver$Resolution = iArr;
            try {
                iArr[AmbiguityResolver.Resolution.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$bytebuddy$implementation$bind$MethodDelegationBinder$AmbiguityResolver$Resolution[AmbiguityResolver.Resolution.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$net$bytebuddy$implementation$bind$MethodDelegationBinder$AmbiguityResolver$Resolution[AmbiguityResolver.Resolution.AMBIGUOUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$net$bytebuddy$implementation$bind$MethodDelegationBinder$AmbiguityResolver$Resolution[AmbiguityResolver.Resolution.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface AmbiguityResolver {
        public static final AmbiguityResolver DEFAULT = new Compound(BindingPriority.Resolver.INSTANCE, DeclaringTypeResolver.INSTANCE, ArgumentTypeResolver.INSTANCE, MethodNameEqualityResolver.INSTANCE, ParameterLengthResolver.INSTANCE);

        Resolution resolve(MethodDescription methodDescription, MethodBinding methodBinding, MethodBinding methodBinding2);

        public enum Resolution {
            UNKNOWN(true),
            LEFT(false),
            RIGHT(false),
            AMBIGUOUS(true);

            private final boolean unresolved;

            Resolution(boolean z) {
                this.unresolved = z;
            }

            public boolean isUnresolved() {
                return this.unresolved;
            }

            public Resolution merge(Resolution resolution) {
                int i = AnonymousClass1.$SwitchMap$net$bytebuddy$implementation$bind$MethodDelegationBinder$AmbiguityResolver$Resolution[ordinal()];
                if (i == 1 || i == 2) {
                    return (resolution == UNKNOWN || resolution == this) ? this : AMBIGUOUS;
                }
                if (i == 3) {
                    return AMBIGUOUS;
                }
                if (i == 4) {
                    return resolution;
                }
                throw new AssertionError();
            }
        }

        public enum NoOp implements AmbiguityResolver {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver
            public Resolution resolve(MethodDescription methodDescription, MethodBinding methodBinding, MethodBinding methodBinding2) {
                return Resolution.UNKNOWN;
            }
        }

        public enum Directional implements AmbiguityResolver {
            LEFT(true),
            RIGHT(false);

            private final boolean left;

            Directional(boolean z) {
                this.left = z;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver
            public Resolution resolve(MethodDescription methodDescription, MethodBinding methodBinding, MethodBinding methodBinding2) {
                return this.left ? Resolution.LEFT : Resolution.RIGHT;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Compound implements AmbiguityResolver {
            private final List<AmbiguityResolver> ambiguityResolvers;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.ambiguityResolvers.equals(((Compound) obj).ambiguityResolvers);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.ambiguityResolvers.hashCode();
            }

            public Compound(AmbiguityResolver... ambiguityResolverArr) {
                this((List<? extends AmbiguityResolver>) Arrays.asList(ambiguityResolverArr));
            }

            public Compound(List<? extends AmbiguityResolver> list) {
                this.ambiguityResolvers = new ArrayList();
                for (AmbiguityResolver ambiguityResolver : list) {
                    if (ambiguityResolver instanceof Compound) {
                        this.ambiguityResolvers.addAll(((Compound) ambiguityResolver).ambiguityResolvers);
                    } else if (!(ambiguityResolver instanceof NoOp)) {
                        this.ambiguityResolvers.add(ambiguityResolver);
                    }
                }
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver
            public Resolution resolve(MethodDescription methodDescription, MethodBinding methodBinding, MethodBinding methodBinding2) {
                Resolution resolution = Resolution.UNKNOWN;
                Iterator<AmbiguityResolver> it = this.ambiguityResolvers.iterator();
                while (resolution.isUnresolved() && it.hasNext()) {
                    resolution = it.next().resolve(methodDescription, methodBinding, methodBinding2);
                }
                return resolution;
            }
        }
    }

    public interface TerminationHandler {
        StackManipulation resolve(Assigner assigner, Assigner.Typing typing, MethodDescription methodDescription, MethodDescription methodDescription2);

        public enum Default implements TerminationHandler {
            RETURNING { // from class: org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler.Default.1
                @Override // org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler
                public StackManipulation resolve(Assigner assigner, Assigner.Typing typing, MethodDescription methodDescription, MethodDescription methodDescription2) {
                    TypeDescription.Generic returnType;
                    StackManipulation[] stackManipulationArr = new StackManipulation[2];
                    if (methodDescription2.isConstructor()) {
                        returnType = methodDescription2.getDeclaringType().asGenericType();
                    } else {
                        returnType = methodDescription2.getReturnType();
                    }
                    stackManipulationArr[0] = assigner.assign(returnType, methodDescription.getReturnType(), typing);
                    stackManipulationArr[1] = MethodReturn.of(methodDescription.getReturnType());
                    return new StackManipulation.Compound(stackManipulationArr);
                }
            },
            DROPPING { // from class: org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler.Default.2
                @Override // org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder.TerminationHandler
                public StackManipulation resolve(Assigner assigner, Assigner.Typing typing, MethodDescription methodDescription, MethodDescription methodDescription2) {
                    TypeDefinition returnType;
                    if (methodDescription2.isConstructor()) {
                        returnType = methodDescription2.getDeclaringType();
                    } else {
                        returnType = methodDescription2.getReturnType();
                    }
                    return Removal.of(returnType);
                }
            };

            /* synthetic */ Default(AnonymousClass1 anonymousClass1) {
                this();
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Processor implements Record {
        private final AmbiguityResolver ambiguityResolver;
        private final BindingResolver bindingResolver;
        private final List<? extends Record> records;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Processor processor = (Processor) obj;
            return this.records.equals(processor.records) && this.ambiguityResolver.equals(processor.ambiguityResolver) && this.bindingResolver.equals(processor.bindingResolver);
        }

        public int hashCode() {
            return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.records.hashCode()) * 31) + this.ambiguityResolver.hashCode()) * 31) + this.bindingResolver.hashCode();
        }

        public Processor(List<? extends Record> list, AmbiguityResolver ambiguityResolver, BindingResolver bindingResolver) {
            this.records = list;
            this.ambiguityResolver = ambiguityResolver;
            this.bindingResolver = bindingResolver;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder.Record
        public MethodBinding bind(Implementation.Target target, MethodDescription methodDescription, TerminationHandler terminationHandler, MethodInvoker methodInvoker, Assigner assigner) {
            ArrayList arrayList = new ArrayList();
            Iterator<? extends Record> it = this.records.iterator();
            while (it.hasNext()) {
                MethodBinding bind = it.next().bind(target, methodDescription, terminationHandler, methodInvoker, assigner);
                if (bind.isValid()) {
                    arrayList.add(bind);
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalArgumentException("None of " + this.records + " allows for delegation from " + methodDescription);
            }
            return this.bindingResolver.resolve(this.ambiguityResolver, methodDescription, arrayList);
        }
    }
}
