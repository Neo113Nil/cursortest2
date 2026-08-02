package org.modelmapper.internal.bytebuddy.agent.builder;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.File;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.lang.instrument.ClassDefinition;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.ProtectionDomain;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.modelmapper.internal.asm.Label;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.asm.Opcodes;
import org.modelmapper.internal.bytebuddy.ByteBuddy;
import org.modelmapper.internal.bytebuddy.ClassFileVersion;
import org.modelmapper.internal.bytebuddy.agent.builder.ResettableClassFileTransformer;
import org.modelmapper.internal.bytebuddy.asm.Advice;
import org.modelmapper.internal.bytebuddy.asm.AsmVisitorWrapper;
import org.modelmapper.internal.bytebuddy.build.EntryPoint;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.build.Plugin;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.ParameterDescription;
import org.modelmapper.internal.bytebuddy.description.modifier.FieldManifestation;
import org.modelmapper.internal.bytebuddy.description.modifier.MethodManifestation;
import org.modelmapper.internal.bytebuddy.description.modifier.ModifierContributor;
import org.modelmapper.internal.bytebuddy.description.modifier.Ownership;
import org.modelmapper.internal.bytebuddy.description.modifier.TypeManifestation;
import org.modelmapper.internal.bytebuddy.description.modifier.Visibility;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator;
import org.modelmapper.internal.bytebuddy.dynamic.DynamicType;
import org.modelmapper.internal.bytebuddy.dynamic.NexusAccessor;
import org.modelmapper.internal.bytebuddy.dynamic.TypeResolutionStrategy;
import org.modelmapper.internal.bytebuddy.dynamic.loading.ClassInjector;
import org.modelmapper.internal.bytebuddy.dynamic.loading.ClassLoadingStrategy;
import org.modelmapper.internal.bytebuddy.dynamic.loading.ClassReloadingStrategy;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeValidation;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy;
import org.modelmapper.internal.bytebuddy.implementation.ExceptionMethod;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.LoadedTypeInitializer;
import org.modelmapper.internal.bytebuddy.implementation.MethodCall;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.AuxiliaryType;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.Duplication;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.TypeCreation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.Assigner;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.TypeCasting;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.collection.ArrayFactory;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.ClassConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.IntegerConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.TextConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.FieldAccess;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodInvocation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodReturn;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;
import org.modelmapper.internal.bytebuddy.matcher.LatentMatcher;
import org.modelmapper.internal.bytebuddy.pool.TypePool;
import org.modelmapper.internal.bytebuddy.utility.CompoundList;
import org.modelmapper.internal.bytebuddy.utility.JavaConstant;
import org.modelmapper.internal.bytebuddy.utility.JavaModule;
import org.modelmapper.internal.bytebuddy.utility.JavaType;

/* loaded from: classes4.dex */
public interface AgentBuilder {

    public interface Identified {

        public interface Extendable extends AgentBuilder, Identified {
            AgentBuilder asDecorator();
        }

        public interface Narrowable extends Matchable<Narrowable>, Identified {
        }

        Extendable transform(Transformer transformer);
    }

    public interface Ignored extends Matchable<Ignored>, AgentBuilder {
    }

    public interface RedefinitionListenable extends AgentBuilder {

        public interface WithImplicitDiscoveryStrategy extends RedefinitionListenable {
            RedefinitionListenable redefineOnly(Class<?>... clsArr);

            RedefinitionListenable with(RedefinitionStrategy.DiscoveryStrategy discoveryStrategy);
        }

        public interface WithoutBatchStrategy extends WithImplicitDiscoveryStrategy {
            WithImplicitDiscoveryStrategy with(RedefinitionStrategy.BatchAllocator batchAllocator);
        }

        RedefinitionListenable with(RedefinitionStrategy.Listener listener);

        AgentBuilder withResubmission(RedefinitionStrategy.ResubmissionScheduler resubmissionScheduler);

        AgentBuilder withResubmission(RedefinitionStrategy.ResubmissionScheduler resubmissionScheduler, ElementMatcher<? super Throwable> elementMatcher);
    }

    AgentBuilder assureReadEdgeFromAndTo(Instrumentation instrumentation, Collection<? extends JavaModule> collection);

    AgentBuilder assureReadEdgeFromAndTo(Instrumentation instrumentation, Class<?>... clsArr);

    AgentBuilder assureReadEdgeFromAndTo(Instrumentation instrumentation, JavaModule... javaModuleArr);

    AgentBuilder assureReadEdgeTo(Instrumentation instrumentation, Collection<? extends JavaModule> collection);

    AgentBuilder assureReadEdgeTo(Instrumentation instrumentation, Class<?>... clsArr);

    AgentBuilder assureReadEdgeTo(Instrumentation instrumentation, JavaModule... javaModuleArr);

    AgentBuilder disableBootstrapInjection();

    AgentBuilder disableClassFormatChanges();

    AgentBuilder disableNativeMethodPrefix();

    AgentBuilder enableBootstrapInjection(Instrumentation instrumentation, File file);

    AgentBuilder enableNativeMethodPrefix(String str);

    AgentBuilder enableUnsafeBootstrapInjection();

    Ignored ignore(RawMatcher rawMatcher);

    Ignored ignore(ElementMatcher<? super TypeDescription> elementMatcher);

    Ignored ignore(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2);

    Ignored ignore(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2, ElementMatcher<? super JavaModule> elementMatcher3);

    ResettableClassFileTransformer installOn(Instrumentation instrumentation);

    ResettableClassFileTransformer installOnByteBuddyAgent();

    ClassFileTransformer makeRaw();

    Identified.Narrowable type(RawMatcher rawMatcher);

    Identified.Narrowable type(ElementMatcher<? super TypeDescription> elementMatcher);

    Identified.Narrowable type(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2);

    Identified.Narrowable type(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2, ElementMatcher<? super JavaModule> elementMatcher3);

    RedefinitionListenable.WithoutBatchStrategy with(RedefinitionStrategy redefinitionStrategy);

    AgentBuilder with(ByteBuddy byteBuddy);

    AgentBuilder with(CircularityLock circularityLock);

    AgentBuilder with(ClassFileBufferStrategy classFileBufferStrategy);

    AgentBuilder with(DescriptionStrategy descriptionStrategy);

    AgentBuilder with(FallbackStrategy fallbackStrategy);

    AgentBuilder with(InitializationStrategy initializationStrategy);

    AgentBuilder with(InstallationListener installationListener);

    AgentBuilder with(LambdaInstrumentationStrategy lambdaInstrumentationStrategy);

    AgentBuilder with(Listener listener);

    AgentBuilder with(LocationStrategy locationStrategy);

    AgentBuilder with(PoolStrategy poolStrategy);

    AgentBuilder with(TypeStrategy typeStrategy);

    public interface Matchable<T extends Matchable<T>> {
        T and(RawMatcher rawMatcher);

        T and(ElementMatcher<? super TypeDescription> elementMatcher);

        T and(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2);

        T and(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2, ElementMatcher<? super JavaModule> elementMatcher3);

        T or(RawMatcher rawMatcher);

        T or(ElementMatcher<? super TypeDescription> elementMatcher);

        T or(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2);

        T or(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2, ElementMatcher<? super JavaModule> elementMatcher3);

        public static abstract class AbstractBase<S extends Matchable<S>> implements Matchable<S> {
            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Matchable
            public S and(ElementMatcher<? super TypeDescription> elementMatcher) {
                return and(elementMatcher, ElementMatchers.any());
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Matchable
            public S and(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2) {
                return and(elementMatcher, elementMatcher2, ElementMatchers.any());
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Matchable
            public S and(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2, ElementMatcher<? super JavaModule> elementMatcher3) {
                return (S) and(new RawMatcher.ForElementMatchers(elementMatcher, elementMatcher2, elementMatcher3));
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Matchable
            public S or(ElementMatcher<? super TypeDescription> elementMatcher) {
                return or(elementMatcher, ElementMatchers.any());
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Matchable
            public S or(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2) {
                return or(elementMatcher, elementMatcher2, ElementMatchers.any());
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Matchable
            public S or(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2, ElementMatcher<? super JavaModule> elementMatcher3) {
                return (S) or(new RawMatcher.ForElementMatchers(elementMatcher, elementMatcher2, elementMatcher3));
            }
        }
    }

    public interface RawMatcher {
        boolean matches(TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule, Class<?> cls, ProtectionDomain protectionDomain);

        public enum Trivial implements RawMatcher {
            MATCHING(true),
            NON_MATCHING(false);

            private final boolean matches;

            Trivial(boolean z) {
                this.matches = z;
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RawMatcher
            public boolean matches(TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule, Class<?> cls, ProtectionDomain protectionDomain) {
                return this.matches;
            }
        }

        public enum ForLoadState implements RawMatcher {
            LOADED(false),
            UNLOADED(true);

            private final boolean unloaded;

            ForLoadState(boolean z) {
                this.unloaded = z;
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RawMatcher
            public boolean matches(TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule, Class<?> cls, ProtectionDomain protectionDomain) {
                return (cls == null) == this.unloaded;
            }
        }

        public enum ForResolvableTypes implements RawMatcher {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RawMatcher
            public boolean matches(TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule, Class<?> cls, ProtectionDomain protectionDomain) {
                if (cls == null) {
                    return true;
                }
                try {
                    return Class.forName(cls.getName(), true, classLoader) == cls;
                } catch (Throwable unused) {
                    return false;
                }
            }

            public RawMatcher inverted() {
                return new Inversion(this);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Conjunction implements RawMatcher {
            private final RawMatcher left;
            private final RawMatcher right;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Conjunction conjunction = (Conjunction) obj;
                return this.left.equals(conjunction.left) && this.right.equals(conjunction.right);
            }

            public int hashCode() {
                return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.left.hashCode()) * 31) + this.right.hashCode();
            }

            protected Conjunction(RawMatcher rawMatcher, RawMatcher rawMatcher2) {
                this.left = rawMatcher;
                this.right = rawMatcher2;
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RawMatcher
            public boolean matches(TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule, Class<?> cls, ProtectionDomain protectionDomain) {
                return this.left.matches(typeDescription, classLoader, javaModule, cls, protectionDomain) && this.right.matches(typeDescription, classLoader, javaModule, cls, protectionDomain);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Disjunction implements RawMatcher {
            private final RawMatcher left;
            private final RawMatcher right;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Disjunction disjunction = (Disjunction) obj;
                return this.left.equals(disjunction.left) && this.right.equals(disjunction.right);
            }

            public int hashCode() {
                return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.left.hashCode()) * 31) + this.right.hashCode();
            }

            protected Disjunction(RawMatcher rawMatcher, RawMatcher rawMatcher2) {
                this.left = rawMatcher;
                this.right = rawMatcher2;
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RawMatcher
            public boolean matches(TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule, Class<?> cls, ProtectionDomain protectionDomain) {
                return this.left.matches(typeDescription, classLoader, javaModule, cls, protectionDomain) || this.right.matches(typeDescription, classLoader, javaModule, cls, protectionDomain);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Inversion implements RawMatcher {
            private final RawMatcher matcher;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.matcher.equals(((Inversion) obj).matcher);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.matcher.hashCode();
            }

            public Inversion(RawMatcher rawMatcher) {
                this.matcher = rawMatcher;
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RawMatcher
            public boolean matches(TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule, Class<?> cls, ProtectionDomain protectionDomain) {
                return !this.matcher.matches(typeDescription, classLoader, javaModule, cls, protectionDomain);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForElementMatchers implements RawMatcher {
            private final ElementMatcher<? super ClassLoader> classLoaderMatcher;
            private final ElementMatcher<? super JavaModule> moduleMatcher;
            private final ElementMatcher<? super TypeDescription> typeMatcher;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForElementMatchers forElementMatchers = (ForElementMatchers) obj;
                return this.typeMatcher.equals(forElementMatchers.typeMatcher) && this.classLoaderMatcher.equals(forElementMatchers.classLoaderMatcher) && this.moduleMatcher.equals(forElementMatchers.moduleMatcher);
            }

            public int hashCode() {
                return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeMatcher.hashCode()) * 31) + this.classLoaderMatcher.hashCode()) * 31) + this.moduleMatcher.hashCode();
            }

            public ForElementMatchers(ElementMatcher<? super TypeDescription> elementMatcher) {
                this(elementMatcher, ElementMatchers.any());
            }

            public ForElementMatchers(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2) {
                this(elementMatcher, elementMatcher2, ElementMatchers.any());
            }

            public ForElementMatchers(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2, ElementMatcher<? super JavaModule> elementMatcher3) {
                this.typeMatcher = elementMatcher;
                this.classLoaderMatcher = elementMatcher2;
                this.moduleMatcher = elementMatcher3;
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RawMatcher
            public boolean matches(TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule, Class<?> cls, ProtectionDomain protectionDomain) {
                return this.moduleMatcher.matches(javaModule) && this.classLoaderMatcher.matches(classLoader) && this.typeMatcher.matches(typeDescription);
            }
        }
    }

    public interface Listener {
        public static final boolean LOADED = true;

        public static abstract class Adapter implements Listener {
            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onComplete(String str, ClassLoader classLoader, JavaModule javaModule, boolean z) {
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onDiscovery(String str, ClassLoader classLoader, JavaModule javaModule, boolean z) {
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onError(String str, ClassLoader classLoader, JavaModule javaModule, boolean z, Throwable th) {
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onIgnored(TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule, boolean z) {
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onTransformation(TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule, boolean z, DynamicType dynamicType) {
            }
        }

        public enum NoOp implements Listener {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onComplete(String str, ClassLoader classLoader, JavaModule javaModule, boolean z) {
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onDiscovery(String str, ClassLoader classLoader, JavaModule javaModule, boolean z) {
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onError(String str, ClassLoader classLoader, JavaModule javaModule, boolean z, Throwable th) {
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onIgnored(TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule, boolean z) {
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onTransformation(TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule, boolean z, DynamicType dynamicType) {
            }
        }

        void onComplete(String str, ClassLoader classLoader, JavaModule javaModule, boolean z);

        void onDiscovery(String str, ClassLoader classLoader, JavaModule javaModule, boolean z);

        void onError(String str, ClassLoader classLoader, JavaModule javaModule, boolean z, Throwable th);

        void onIgnored(TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule, boolean z);

        void onTransformation(TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule, boolean z, DynamicType dynamicType);

        @HashCodeAndEqualsPlugin.Enhance
        public static class StreamWriting implements Listener {
            protected static final String PREFIX = "[Byte Buddy]";
            private final PrintStream printStream;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.printStream.equals(((StreamWriting) obj).printStream);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.printStream.hashCode();
            }

            public StreamWriting(PrintStream printStream) {
                this.printStream = printStream;
            }

            public static StreamWriting toSystemOut() {
                return new StreamWriting(System.out);
            }

            public static StreamWriting toSystemError() {
                return new StreamWriting(System.err);
            }

            public Listener withTransformationsOnly() {
                return new WithTransformationsOnly(this);
            }

            public Listener withErrorsOnly() {
                return new WithErrorsOnly(this);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onDiscovery(String str, ClassLoader classLoader, JavaModule javaModule, boolean z) {
                this.printStream.printf("[Byte Buddy] DISCOVERY %s [%s, %s, loaded=%b]%n", str, classLoader, javaModule, Boolean.valueOf(z));
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onTransformation(TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule, boolean z, DynamicType dynamicType) {
                this.printStream.printf("[Byte Buddy] TRANSFORM %s [%s, %s, loaded=%b]%n", typeDescription.getName(), classLoader, javaModule, Boolean.valueOf(z));
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onIgnored(TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule, boolean z) {
                this.printStream.printf("[Byte Buddy] IGNORE %s [%s, %s, loaded=%b]%n", typeDescription.getName(), classLoader, javaModule, Boolean.valueOf(z));
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onError(String str, ClassLoader classLoader, JavaModule javaModule, boolean z, Throwable th) {
                synchronized (this.printStream) {
                    this.printStream.printf("[Byte Buddy] ERROR %s [%s, %s, loaded=%b]%n", str, classLoader, javaModule, Boolean.valueOf(z));
                    th.printStackTrace(this.printStream);
                }
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onComplete(String str, ClassLoader classLoader, JavaModule javaModule, boolean z) {
                this.printStream.printf("[Byte Buddy] COMPLETE %s [%s, %s, loaded=%b]%n", str, classLoader, javaModule, Boolean.valueOf(z));
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Filtering implements Listener {
            private final Listener delegate;
            private final ElementMatcher<? super String> matcher;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Filtering filtering = (Filtering) obj;
                return this.matcher.equals(filtering.matcher) && this.delegate.equals(filtering.delegate);
            }

            public int hashCode() {
                return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.matcher.hashCode()) * 31) + this.delegate.hashCode();
            }

            public Filtering(ElementMatcher<? super String> elementMatcher, Listener listener) {
                this.matcher = elementMatcher;
                this.delegate = listener;
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onDiscovery(String str, ClassLoader classLoader, JavaModule javaModule, boolean z) {
                if (this.matcher.matches(str)) {
                    this.delegate.onDiscovery(str, classLoader, javaModule, z);
                }
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onTransformation(TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule, boolean z, DynamicType dynamicType) {
                if (this.matcher.matches(typeDescription.getName())) {
                    this.delegate.onTransformation(typeDescription, classLoader, javaModule, z, dynamicType);
                }
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onIgnored(TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule, boolean z) {
                if (this.matcher.matches(typeDescription.getName())) {
                    this.delegate.onIgnored(typeDescription, classLoader, javaModule, z);
                }
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onError(String str, ClassLoader classLoader, JavaModule javaModule, boolean z, Throwable th) {
                if (this.matcher.matches(str)) {
                    this.delegate.onError(str, classLoader, javaModule, z, th);
                }
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onComplete(String str, ClassLoader classLoader, JavaModule javaModule, boolean z) {
                if (this.matcher.matches(str)) {
                    this.delegate.onComplete(str, classLoader, javaModule, z);
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class WithTransformationsOnly extends Adapter {
            private final Listener delegate;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.delegate.equals(((WithTransformationsOnly) obj).delegate);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.delegate.hashCode();
            }

            public WithTransformationsOnly(Listener listener) {
                this.delegate = listener;
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Listener.Adapter, org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onTransformation(TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule, boolean z, DynamicType dynamicType) {
                this.delegate.onTransformation(typeDescription, classLoader, javaModule, z, dynamicType);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Listener.Adapter, org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onError(String str, ClassLoader classLoader, JavaModule javaModule, boolean z, Throwable th) {
                this.delegate.onError(str, classLoader, javaModule, z, th);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class WithErrorsOnly extends Adapter {
            private final Listener delegate;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.delegate.equals(((WithErrorsOnly) obj).delegate);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.delegate.hashCode();
            }

            public WithErrorsOnly(Listener listener) {
                this.delegate = listener;
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Listener.Adapter, org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onError(String str, ClassLoader classLoader, JavaModule javaModule, boolean z, Throwable th) {
                this.delegate.onError(str, classLoader, javaModule, z, th);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ModuleReadEdgeCompleting extends Adapter {
            private final boolean addTargetEdge;
            private final Instrumentation instrumentation;
            private final Set<? extends JavaModule> modules;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ModuleReadEdgeCompleting moduleReadEdgeCompleting = (ModuleReadEdgeCompleting) obj;
                return this.instrumentation.equals(moduleReadEdgeCompleting.instrumentation) && this.addTargetEdge == moduleReadEdgeCompleting.addTargetEdge && this.modules.equals(moduleReadEdgeCompleting.modules);
            }

            public int hashCode() {
                return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.instrumentation.hashCode()) * 31) + (this.addTargetEdge ? 1 : 0)) * 31) + this.modules.hashCode();
            }

            public ModuleReadEdgeCompleting(Instrumentation instrumentation, boolean z, Set<? extends JavaModule> set) {
                this.instrumentation = instrumentation;
                this.addTargetEdge = z;
                this.modules = set;
            }

            public static Listener of(Instrumentation instrumentation, boolean z, Class<?>... clsArr) {
                HashSet hashSet = new HashSet();
                for (Class<?> cls : clsArr) {
                    hashSet.add(JavaModule.ofType(cls));
                }
                return hashSet.isEmpty() ? NoOp.INSTANCE : new ModuleReadEdgeCompleting(instrumentation, z, hashSet);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Listener.Adapter, org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onTransformation(TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule, boolean z, DynamicType dynamicType) {
                if (javaModule == JavaModule.UNSUPPORTED || !javaModule.isNamed()) {
                    return;
                }
                for (JavaModule javaModule2 : this.modules) {
                    if (!javaModule.canRead(javaModule2)) {
                        javaModule.addReads(this.instrumentation, javaModule2);
                    }
                    if (this.addTargetEdge && !javaModule2.canRead(javaModule)) {
                        javaModule2.addReads(this.instrumentation, javaModule);
                    }
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Compound implements Listener {
            private final List<Listener> listeners;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.listeners.equals(((Compound) obj).listeners);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.listeners.hashCode();
            }

            public Compound(Listener... listenerArr) {
                this((List<? extends Listener>) Arrays.asList(listenerArr));
            }

            public Compound(List<? extends Listener> list) {
                this.listeners = new ArrayList();
                for (Listener listener : list) {
                    if (listener instanceof Compound) {
                        this.listeners.addAll(((Compound) listener).listeners);
                    } else if (!(listener instanceof NoOp)) {
                        this.listeners.add(listener);
                    }
                }
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onDiscovery(String str, ClassLoader classLoader, JavaModule javaModule, boolean z) {
                Iterator<Listener> it = this.listeners.iterator();
                while (it.hasNext()) {
                    it.next().onDiscovery(str, classLoader, javaModule, z);
                }
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onTransformation(TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule, boolean z, DynamicType dynamicType) {
                Iterator<Listener> it = this.listeners.iterator();
                while (it.hasNext()) {
                    it.next().onTransformation(typeDescription, classLoader, javaModule, z, dynamicType);
                }
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onIgnored(TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule, boolean z) {
                Iterator<Listener> it = this.listeners.iterator();
                while (it.hasNext()) {
                    it.next().onIgnored(typeDescription, classLoader, javaModule, z);
                }
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onError(String str, ClassLoader classLoader, JavaModule javaModule, boolean z, Throwable th) {
                Iterator<Listener> it = this.listeners.iterator();
                while (it.hasNext()) {
                    it.next().onError(str, classLoader, javaModule, z, th);
                }
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Listener
            public void onComplete(String str, ClassLoader classLoader, JavaModule javaModule, boolean z) {
                Iterator<Listener> it = this.listeners.iterator();
                while (it.hasNext()) {
                    it.next().onComplete(str, classLoader, javaModule, z);
                }
            }
        }
    }

    public interface CircularityLock {

        public enum Inactive implements CircularityLock {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.CircularityLock
            public boolean acquire() {
                return true;
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.CircularityLock
            public void release() {
            }
        }

        boolean acquire();

        void release();

        public static class Default extends ThreadLocal<Boolean> implements CircularityLock {
            private static final Boolean NOT_ACQUIRED = null;

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.CircularityLock
            public boolean acquire() {
                if (get() != NOT_ACQUIRED) {
                    return false;
                }
                set(true);
                return true;
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.CircularityLock
            public void release() {
                set(NOT_ACQUIRED);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Global implements CircularityLock {
            private final Lock lock;
            private final long time;
            private final TimeUnit timeUnit;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Global global = (Global) obj;
                return this.lock.equals(global.lock) && this.time == global.time && this.timeUnit.equals(global.timeUnit);
            }

            public int hashCode() {
                int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.lock.hashCode()) * 31;
                long j = this.time;
                return ((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.timeUnit.hashCode();
            }

            public Global() {
                this(0L, TimeUnit.MILLISECONDS);
            }

            public Global(long j, TimeUnit timeUnit) {
                this.lock = new ReentrantLock();
                this.time = j;
                this.timeUnit = timeUnit;
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.CircularityLock
            public boolean acquire() {
                try {
                    long j = this.time;
                    if (j == 0) {
                        return this.lock.tryLock();
                    }
                    return this.lock.tryLock(j, this.timeUnit);
                } catch (InterruptedException unused) {
                    return false;
                }
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.CircularityLock
            public void release() {
                this.lock.unlock();
            }
        }
    }

    public interface TypeStrategy {
        DynamicType.Builder<?> builder(TypeDescription typeDescription, ByteBuddy byteBuddy, ClassFileLocator classFileLocator, MethodNameTransformer methodNameTransformer, ClassLoader classLoader, JavaModule javaModule, ProtectionDomain protectionDomain);

        public enum Default implements TypeStrategy {
            REBASE { // from class: org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.TypeStrategy.Default.1
                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.TypeStrategy
                public DynamicType.Builder<?> builder(TypeDescription typeDescription, ByteBuddy byteBuddy, ClassFileLocator classFileLocator, MethodNameTransformer methodNameTransformer, ClassLoader classLoader, JavaModule javaModule, ProtectionDomain protectionDomain) {
                    return byteBuddy.rebase(typeDescription, classFileLocator, methodNameTransformer);
                }
            },
            REDEFINE { // from class: org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.TypeStrategy.Default.2
                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.TypeStrategy
                public DynamicType.Builder<?> builder(TypeDescription typeDescription, ByteBuddy byteBuddy, ClassFileLocator classFileLocator, MethodNameTransformer methodNameTransformer, ClassLoader classLoader, JavaModule javaModule, ProtectionDomain protectionDomain) {
                    return byteBuddy.redefine(typeDescription, classFileLocator);
                }
            },
            REDEFINE_FROZEN { // from class: org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.TypeStrategy.Default.3
                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.TypeStrategy
                public DynamicType.Builder<?> builder(TypeDescription typeDescription, ByteBuddy byteBuddy, ClassFileLocator classFileLocator, MethodNameTransformer methodNameTransformer, ClassLoader classLoader, JavaModule javaModule, ProtectionDomain protectionDomain) {
                    return byteBuddy.with(InstrumentedType.Factory.Default.FROZEN).redefine(typeDescription, classFileLocator).ignoreAlso(LatentMatcher.ForSelfDeclaredMethod.NOT_DECLARED);
                }
            },
            DECORATE { // from class: org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.TypeStrategy.Default.4
                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.TypeStrategy
                public DynamicType.Builder<?> builder(TypeDescription typeDescription, ByteBuddy byteBuddy, ClassFileLocator classFileLocator, MethodNameTransformer methodNameTransformer, ClassLoader classLoader, JavaModule javaModule, ProtectionDomain protectionDomain) {
                    return byteBuddy.decorate(typeDescription, classFileLocator);
                }
            };

            /* synthetic */ Default(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForBuildEntryPoint implements TypeStrategy {
            private final EntryPoint entryPoint;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.entryPoint.equals(((ForBuildEntryPoint) obj).entryPoint);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.entryPoint.hashCode();
            }

            public ForBuildEntryPoint(EntryPoint entryPoint) {
                this.entryPoint = entryPoint;
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.TypeStrategy
            public DynamicType.Builder<?> builder(TypeDescription typeDescription, ByteBuddy byteBuddy, ClassFileLocator classFileLocator, MethodNameTransformer methodNameTransformer, ClassLoader classLoader, JavaModule javaModule, ProtectionDomain protectionDomain) {
                return this.entryPoint.transform(typeDescription, byteBuddy, classFileLocator, methodNameTransformer);
            }
        }
    }

    public interface Transformer {

        public enum NoOp implements Transformer {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Transformer
            public DynamicType.Builder<?> transform(DynamicType.Builder<?> builder, TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule) {
                return builder;
            }
        }

        DynamicType.Builder<?> transform(DynamicType.Builder<?> builder, TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule);

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForBuildPlugin implements Transformer {
            private final Plugin plugin;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.plugin.equals(((ForBuildPlugin) obj).plugin);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.plugin.hashCode();
            }

            public ForBuildPlugin(Plugin plugin) {
                this.plugin = plugin;
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Transformer
            public DynamicType.Builder<?> transform(DynamicType.Builder<?> builder, TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule) {
                return this.plugin.apply(builder, typeDescription, ClassFileLocator.ForClassLoader.of(classLoader));
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForAdvice implements Transformer {
            private final Advice.WithCustomMapping advice;
            private final Assigner assigner;
            private final ClassFileLocator classFileLocator;
            private final List<Entry> entries;
            private final Advice.ExceptionHandler exceptionHandler;
            private final LocationStrategy locationStrategy;
            private final PoolStrategy poolStrategy;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForAdvice forAdvice = (ForAdvice) obj;
                return this.advice.equals(forAdvice.advice) && this.exceptionHandler.equals(forAdvice.exceptionHandler) && this.assigner.equals(forAdvice.assigner) && this.classFileLocator.equals(forAdvice.classFileLocator) && this.poolStrategy.equals(forAdvice.poolStrategy) && this.locationStrategy.equals(forAdvice.locationStrategy) && this.entries.equals(forAdvice.entries);
            }

            public int hashCode() {
                return ((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.advice.hashCode()) * 31) + this.exceptionHandler.hashCode()) * 31) + this.assigner.hashCode()) * 31) + this.classFileLocator.hashCode()) * 31) + this.poolStrategy.hashCode()) * 31) + this.locationStrategy.hashCode()) * 31) + this.entries.hashCode();
            }

            public ForAdvice() {
                this(Advice.withCustomMapping());
            }

            public ForAdvice(Advice.WithCustomMapping withCustomMapping) {
                this(withCustomMapping, Advice.ExceptionHandler.Default.SUPPRESSING, Assigner.DEFAULT, ClassFileLocator.NoOp.INSTANCE, PoolStrategy.Default.FAST, LocationStrategy.ForClassLoader.STRONG, Collections.emptyList());
            }

            protected ForAdvice(Advice.WithCustomMapping withCustomMapping, Advice.ExceptionHandler exceptionHandler, Assigner assigner, ClassFileLocator classFileLocator, PoolStrategy poolStrategy, LocationStrategy locationStrategy, List<Entry> list) {
                this.advice = withCustomMapping;
                this.exceptionHandler = exceptionHandler;
                this.assigner = assigner;
                this.classFileLocator = classFileLocator;
                this.poolStrategy = poolStrategy;
                this.locationStrategy = locationStrategy;
                this.entries = list;
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Transformer
            public DynamicType.Builder<?> transform(DynamicType.Builder<?> builder, TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule) {
                ClassFileLocator.Compound compound = new ClassFileLocator.Compound(this.classFileLocator, this.locationStrategy.classFileLocator(classLoader, javaModule));
                TypePool typePool = this.poolStrategy.typePool(compound, classLoader);
                AsmVisitorWrapper.ForDeclaredMethods forDeclaredMethods = new AsmVisitorWrapper.ForDeclaredMethods();
                for (Entry entry : this.entries) {
                    forDeclaredMethods = forDeclaredMethods.method((ElementMatcher<? super MethodDescription>) entry.getMatcher().resolve(typeDescription), entry.resolve(this.advice, typePool, compound).withAssigner(this.assigner).withExceptionHandler(this.exceptionHandler));
                }
                return builder.visit(forDeclaredMethods);
            }

            public ForAdvice with(PoolStrategy poolStrategy) {
                return new ForAdvice(this.advice, this.exceptionHandler, this.assigner, this.classFileLocator, poolStrategy, this.locationStrategy, this.entries);
            }

            public ForAdvice with(LocationStrategy locationStrategy) {
                return new ForAdvice(this.advice, this.exceptionHandler, this.assigner, this.classFileLocator, this.poolStrategy, locationStrategy, this.entries);
            }

            public ForAdvice withExceptionHandler(Advice.ExceptionHandler exceptionHandler) {
                return new ForAdvice(this.advice, exceptionHandler, this.assigner, this.classFileLocator, this.poolStrategy, this.locationStrategy, this.entries);
            }

            public ForAdvice with(Assigner assigner) {
                return new ForAdvice(this.advice, this.exceptionHandler, assigner, this.classFileLocator, this.poolStrategy, this.locationStrategy, this.entries);
            }

            public ForAdvice include(ClassLoader... classLoaderArr) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (ClassLoader classLoader : classLoaderArr) {
                    linkedHashSet.add(ClassFileLocator.ForClassLoader.of(classLoader));
                }
                return include(new ArrayList(linkedHashSet));
            }

            public ForAdvice include(ClassFileLocator... classFileLocatorArr) {
                return include(Arrays.asList(classFileLocatorArr));
            }

            public ForAdvice include(List<? extends ClassFileLocator> list) {
                return new ForAdvice(this.advice, this.exceptionHandler, this.assigner, new ClassFileLocator.Compound((List<? extends ClassFileLocator>) CompoundList.of(this.classFileLocator, list)), this.poolStrategy, this.locationStrategy, this.entries);
            }

            public ForAdvice advice(ElementMatcher<? super MethodDescription> elementMatcher, String str) {
                return advice(new LatentMatcher.Resolved(elementMatcher), str);
            }

            public ForAdvice advice(LatentMatcher<? super MethodDescription> latentMatcher, String str) {
                return new ForAdvice(this.advice, this.exceptionHandler, this.assigner, this.classFileLocator, this.poolStrategy, this.locationStrategy, CompoundList.of(this.entries, new Entry.ForUnifiedAdvice(latentMatcher, str)));
            }

            public ForAdvice advice(ElementMatcher<? super MethodDescription> elementMatcher, String str, String str2) {
                return advice(new LatentMatcher.Resolved(elementMatcher), str, str2);
            }

            public ForAdvice advice(LatentMatcher<? super MethodDescription> latentMatcher, String str, String str2) {
                return new ForAdvice(this.advice, this.exceptionHandler, this.assigner, this.classFileLocator, this.poolStrategy, this.locationStrategy, CompoundList.of(this.entries, new Entry.ForSplitAdvice(latentMatcher, str, str2)));
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static abstract class Entry {
                private final LatentMatcher<? super MethodDescription> matcher;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.matcher.equals(((Entry) obj).matcher);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.matcher.hashCode();
                }

                protected abstract Advice resolve(Advice.WithCustomMapping withCustomMapping, TypePool typePool, ClassFileLocator classFileLocator);

                protected Entry(LatentMatcher<? super MethodDescription> latentMatcher) {
                    this.matcher = latentMatcher;
                }

                protected LatentMatcher<? super MethodDescription> getMatcher() {
                    return this.matcher;
                }

                @HashCodeAndEqualsPlugin.Enhance
                protected static class ForUnifiedAdvice extends Entry {
                    protected final String name;

                    @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Transformer.ForAdvice.Entry
                    public boolean equals(Object obj) {
                        if (!super.equals(obj)) {
                            return false;
                        }
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.name.equals(((ForUnifiedAdvice) obj).name);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Transformer.ForAdvice.Entry
                    public int hashCode() {
                        return (super.hashCode() * 31) + this.name.hashCode();
                    }

                    protected ForUnifiedAdvice(LatentMatcher<? super MethodDescription> latentMatcher, String str) {
                        super(latentMatcher);
                        this.name = str;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Transformer.ForAdvice.Entry
                    protected Advice resolve(Advice.WithCustomMapping withCustomMapping, TypePool typePool, ClassFileLocator classFileLocator) {
                        return withCustomMapping.to(typePool.describe(this.name).resolve(), classFileLocator);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                protected static class ForSplitAdvice extends Entry {
                    private final String enter;
                    private final String exit;

                    @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Transformer.ForAdvice.Entry
                    public boolean equals(Object obj) {
                        if (!super.equals(obj)) {
                            return false;
                        }
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        ForSplitAdvice forSplitAdvice = (ForSplitAdvice) obj;
                        return this.enter.equals(forSplitAdvice.enter) && this.exit.equals(forSplitAdvice.exit);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Transformer.ForAdvice.Entry
                    public int hashCode() {
                        return (((super.hashCode() * 31) + this.enter.hashCode()) * 31) + this.exit.hashCode();
                    }

                    protected ForSplitAdvice(LatentMatcher<? super MethodDescription> latentMatcher, String str, String str2) {
                        super(latentMatcher);
                        this.enter = str;
                        this.exit = str2;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Transformer.ForAdvice.Entry
                    protected Advice resolve(Advice.WithCustomMapping withCustomMapping, TypePool typePool, ClassFileLocator classFileLocator) {
                        return withCustomMapping.to(typePool.describe(this.enter).resolve(), typePool.describe(this.exit).resolve(), classFileLocator);
                    }
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Compound implements Transformer {
            private final List<Transformer> transformers;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.transformers.equals(((Compound) obj).transformers);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.transformers.hashCode();
            }

            public Compound(Transformer... transformerArr) {
                this((List<? extends Transformer>) Arrays.asList(transformerArr));
            }

            public Compound(List<? extends Transformer> list) {
                this.transformers = new ArrayList();
                for (Transformer transformer : list) {
                    if (transformer instanceof Compound) {
                        this.transformers.addAll(((Compound) transformer).transformers);
                    } else if (!(transformer instanceof NoOp)) {
                        this.transformers.add(transformer);
                    }
                }
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Transformer
            public DynamicType.Builder<?> transform(DynamicType.Builder<?> builder, TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule) {
                Iterator<Transformer> it = this.transformers.iterator();
                while (it.hasNext()) {
                    builder = it.next().transform(builder, typeDescription, classLoader, javaModule);
                }
                return builder;
            }
        }
    }

    public interface PoolStrategy {
        TypePool typePool(ClassFileLocator classFileLocator, ClassLoader classLoader);

        public enum Default implements PoolStrategy {
            EXTENDED(TypePool.Default.ReaderMode.EXTENDED),
            FAST(TypePool.Default.ReaderMode.FAST);

            private final TypePool.Default.ReaderMode readerMode;

            Default(TypePool.Default.ReaderMode readerMode) {
                this.readerMode = readerMode;
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.PoolStrategy
            public TypePool typePool(ClassFileLocator classFileLocator, ClassLoader classLoader) {
                return new TypePool.Default.WithLazyResolution(TypePool.CacheProvider.Simple.withObjectType(), classFileLocator, this.readerMode);
            }
        }

        public enum Eager implements PoolStrategy {
            EXTENDED(TypePool.Default.ReaderMode.EXTENDED),
            FAST(TypePool.Default.ReaderMode.FAST);

            private final TypePool.Default.ReaderMode readerMode;

            Eager(TypePool.Default.ReaderMode readerMode) {
                this.readerMode = readerMode;
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.PoolStrategy
            public TypePool typePool(ClassFileLocator classFileLocator, ClassLoader classLoader) {
                return new TypePool.Default(TypePool.CacheProvider.Simple.withObjectType(), classFileLocator, this.readerMode);
            }
        }

        public enum ClassLoading implements PoolStrategy {
            EXTENDED(TypePool.Default.ReaderMode.EXTENDED),
            FAST(TypePool.Default.ReaderMode.FAST);

            private final TypePool.Default.ReaderMode readerMode;

            ClassLoading(TypePool.Default.ReaderMode readerMode) {
                this.readerMode = readerMode;
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.PoolStrategy
            public TypePool typePool(ClassFileLocator classFileLocator, ClassLoader classLoader) {
                return TypePool.ClassLoading.of(classLoader, new TypePool.Default.WithLazyResolution(TypePool.CacheProvider.Simple.withObjectType(), classFileLocator, this.readerMode));
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static abstract class WithTypePoolCache implements PoolStrategy {
            protected final TypePool.Default.ReaderMode readerMode;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.readerMode.equals(((WithTypePoolCache) obj).readerMode);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.readerMode.hashCode();
            }

            protected abstract TypePool.CacheProvider locate(ClassLoader classLoader);

            protected WithTypePoolCache(TypePool.Default.ReaderMode readerMode) {
                this.readerMode = readerMode;
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.PoolStrategy
            public TypePool typePool(ClassFileLocator classFileLocator, ClassLoader classLoader) {
                return new TypePool.Default.WithLazyResolution(locate(classLoader), classFileLocator, this.readerMode);
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class Simple extends WithTypePoolCache {
                private final ConcurrentMap<? super ClassLoader, TypePool.CacheProvider> cacheProviders;

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.PoolStrategy.WithTypePoolCache
                public boolean equals(Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.cacheProviders.equals(((Simple) obj).cacheProviders);
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.PoolStrategy.WithTypePoolCache
                public int hashCode() {
                    return (super.hashCode() * 31) + this.cacheProviders.hashCode();
                }

                public Simple(ConcurrentMap<? super ClassLoader, TypePool.CacheProvider> concurrentMap) {
                    this(TypePool.Default.ReaderMode.FAST, concurrentMap);
                }

                public Simple(TypePool.Default.ReaderMode readerMode, ConcurrentMap<? super ClassLoader, TypePool.CacheProvider> concurrentMap) {
                    super(readerMode);
                    this.cacheProviders = concurrentMap;
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.PoolStrategy.WithTypePoolCache
                protected TypePool.CacheProvider locate(ClassLoader classLoader) {
                    if (classLoader == null) {
                        classLoader = getBootstrapMarkerLoader();
                    }
                    TypePool.CacheProvider cacheProvider = this.cacheProviders.get(classLoader);
                    while (cacheProvider == null) {
                        cacheProvider = TypePool.CacheProvider.Simple.withObjectType();
                        TypePool.CacheProvider putIfAbsent = this.cacheProviders.putIfAbsent(classLoader, cacheProvider);
                        if (putIfAbsent != null) {
                            cacheProvider = putIfAbsent;
                        }
                    }
                    return cacheProvider;
                }

                protected ClassLoader getBootstrapMarkerLoader() {
                    return ClassLoader.getSystemClassLoader();
                }
            }
        }
    }

    public interface InitializationStrategy {

        public interface Dispatcher {

            public interface InjectorFactory {
                ClassInjector resolve();
            }

            DynamicType.Builder<?> apply(DynamicType.Builder<?> builder);

            void register(DynamicType dynamicType, ClassLoader classLoader, InjectorFactory injectorFactory);
        }

        public enum NoOp implements InitializationStrategy, Dispatcher {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.Dispatcher
            public DynamicType.Builder<?> apply(DynamicType.Builder<?> builder) {
                return builder;
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy
            public Dispatcher dispatcher() {
                return this;
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.Dispatcher
            public void register(DynamicType dynamicType, ClassLoader classLoader, Dispatcher.InjectorFactory injectorFactory) {
            }
        }

        Dispatcher dispatcher();

        public enum Minimal implements InitializationStrategy, Dispatcher {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.Dispatcher
            public DynamicType.Builder<?> apply(DynamicType.Builder<?> builder) {
                return builder;
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy
            public Dispatcher dispatcher() {
                return this;
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.Dispatcher
            public void register(DynamicType dynamicType, ClassLoader classLoader, Dispatcher.InjectorFactory injectorFactory) {
                Map<TypeDescription, byte[]> auxiliaryTypes = dynamicType.getAuxiliaryTypes();
                Map<? extends TypeDescription, byte[]> linkedHashMap = new LinkedHashMap<>(auxiliaryTypes);
                for (TypeDescription typeDescription : auxiliaryTypes.keySet()) {
                    if (!typeDescription.getDeclaredAnnotations().isAnnotationPresent(AuxiliaryType.SignatureRelevant.class)) {
                        linkedHashMap.remove(typeDescription);
                    }
                }
                if (linkedHashMap.isEmpty()) {
                    return;
                }
                ClassInjector resolve = injectorFactory.resolve();
                Map<TypeDescription, LoadedTypeInitializer> loadedTypeInitializers = dynamicType.getLoadedTypeInitializers();
                for (Map.Entry<TypeDescription, Class<?>> entry : resolve.inject(linkedHashMap).entrySet()) {
                    loadedTypeInitializers.get(entry.getKey()).onLoad(entry.getValue());
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static abstract class SelfInjection implements InitializationStrategy {
            protected final NexusAccessor nexusAccessor;

            protected abstract Dispatcher dispatcher(int i);

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.nexusAccessor.equals(((SelfInjection) obj).nexusAccessor);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.nexusAccessor.hashCode();
            }

            protected SelfInjection(NexusAccessor nexusAccessor) {
                this.nexusAccessor = nexusAccessor;
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy
            public Dispatcher dispatcher() {
                return dispatcher(new Random().nextInt());
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static abstract class Dispatcher implements Dispatcher {
                protected final int identification;
                protected final NexusAccessor nexusAccessor;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Dispatcher dispatcher = (Dispatcher) obj;
                    return this.nexusAccessor.equals(dispatcher.nexusAccessor) && this.identification == dispatcher.identification;
                }

                public int hashCode() {
                    return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.nexusAccessor.hashCode()) * 31) + this.identification;
                }

                protected Dispatcher(NexusAccessor nexusAccessor, int i) {
                    this.nexusAccessor = nexusAccessor;
                    this.identification = i;
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.Dispatcher
                public DynamicType.Builder<?> apply(DynamicType.Builder<?> builder) {
                    return builder.initializer(new NexusAccessor.InitializationAppender(this.identification));
                }

                @HashCodeAndEqualsPlugin.Enhance
                protected static class InjectingInitializer implements LoadedTypeInitializer {
                    private final ClassInjector classInjector;
                    private final TypeDescription instrumentedType;
                    private final Map<TypeDescription, LoadedTypeInitializer> loadedTypeInitializers;
                    private final Map<TypeDescription, byte[]> rawAuxiliaryTypes;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        InjectingInitializer injectingInitializer = (InjectingInitializer) obj;
                        return this.instrumentedType.equals(injectingInitializer.instrumentedType) && this.rawAuxiliaryTypes.equals(injectingInitializer.rawAuxiliaryTypes) && this.loadedTypeInitializers.equals(injectingInitializer.loadedTypeInitializers) && this.classInjector.equals(injectingInitializer.classInjector);
                    }

                    public int hashCode() {
                        return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.instrumentedType.hashCode()) * 31) + this.rawAuxiliaryTypes.hashCode()) * 31) + this.loadedTypeInitializers.hashCode()) * 31) + this.classInjector.hashCode();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.implementation.LoadedTypeInitializer
                    public boolean isAlive() {
                        return true;
                    }

                    protected InjectingInitializer(TypeDescription typeDescription, Map<TypeDescription, byte[]> map, Map<TypeDescription, LoadedTypeInitializer> map2, ClassInjector classInjector) {
                        this.instrumentedType = typeDescription;
                        this.rawAuxiliaryTypes = map;
                        this.loadedTypeInitializers = map2;
                        this.classInjector = classInjector;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.implementation.LoadedTypeInitializer
                    public void onLoad(Class<?> cls) {
                        for (Map.Entry<TypeDescription, Class<?>> entry : this.classInjector.inject(this.rawAuxiliaryTypes).entrySet()) {
                            this.loadedTypeInitializers.get(entry.getKey()).onLoad(entry.getValue());
                        }
                        this.loadedTypeInitializers.get(this.instrumentedType).onLoad(cls);
                    }
                }
            }

            public static class Split extends SelfInjection {
                public Split() {
                    this(new NexusAccessor());
                }

                public Split(NexusAccessor nexusAccessor) {
                    super(nexusAccessor);
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection
                protected Dispatcher dispatcher(int i) {
                    return new Dispatcher(this.nexusAccessor, i);
                }

                protected static class Dispatcher extends Dispatcher {
                    protected Dispatcher(NexusAccessor nexusAccessor, int i) {
                        super(nexusAccessor, i);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.Dispatcher
                    public void register(DynamicType dynamicType, ClassLoader classLoader, Dispatcher.InjectorFactory injectorFactory) {
                        LoadedTypeInitializer loadedTypeInitializer;
                        Map<TypeDescription, byte[]> auxiliaryTypes = dynamicType.getAuxiliaryTypes();
                        if (!auxiliaryTypes.isEmpty()) {
                            TypeDescription typeDescription = dynamicType.getTypeDescription();
                            ClassInjector resolve = injectorFactory.resolve();
                            LinkedHashMap linkedHashMap = new LinkedHashMap(auxiliaryTypes);
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(auxiliaryTypes);
                            for (TypeDescription typeDescription2 : auxiliaryTypes.keySet()) {
                                (typeDescription2.getDeclaredAnnotations().isAnnotationPresent(AuxiliaryType.SignatureRelevant.class) ? linkedHashMap2 : linkedHashMap).remove(typeDescription2);
                            }
                            Map<TypeDescription, LoadedTypeInitializer> loadedTypeInitializers = dynamicType.getLoadedTypeInitializers();
                            if (!linkedHashMap.isEmpty()) {
                                for (Map.Entry<TypeDescription, Class<?>> entry : resolve.inject(linkedHashMap).entrySet()) {
                                    loadedTypeInitializers.get(entry.getKey()).onLoad(entry.getValue());
                                }
                            }
                            HashMap hashMap = new HashMap(loadedTypeInitializers);
                            loadedTypeInitializers.keySet().removeAll(linkedHashMap.keySet());
                            loadedTypeInitializer = hashMap.size() > 1 ? new Dispatcher.InjectingInitializer(typeDescription, linkedHashMap2, hashMap, resolve) : (LoadedTypeInitializer) hashMap.get(typeDescription);
                        } else {
                            loadedTypeInitializer = dynamicType.getLoadedTypeInitializers().get(dynamicType.getTypeDescription());
                        }
                        this.nexusAccessor.register(dynamicType.getTypeDescription().getName(), classLoader, this.identification, loadedTypeInitializer);
                    }
                }
            }

            public static class Lazy extends SelfInjection {
                public Lazy() {
                    this(new NexusAccessor());
                }

                public Lazy(NexusAccessor nexusAccessor) {
                    super(nexusAccessor);
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection
                protected Dispatcher dispatcher(int i) {
                    return new Dispatcher(this.nexusAccessor, i);
                }

                protected static class Dispatcher extends Dispatcher {
                    protected Dispatcher(NexusAccessor nexusAccessor, int i) {
                        super(nexusAccessor, i);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.Dispatcher
                    public void register(DynamicType dynamicType, ClassLoader classLoader, Dispatcher.InjectorFactory injectorFactory) {
                        LoadedTypeInitializer injectingInitializer;
                        Map<TypeDescription, byte[]> auxiliaryTypes = dynamicType.getAuxiliaryTypes();
                        if (auxiliaryTypes.isEmpty()) {
                            injectingInitializer = dynamicType.getLoadedTypeInitializers().get(dynamicType.getTypeDescription());
                        } else {
                            injectingInitializer = new Dispatcher.InjectingInitializer(dynamicType.getTypeDescription(), auxiliaryTypes, dynamicType.getLoadedTypeInitializers(), injectorFactory.resolve());
                        }
                        this.nexusAccessor.register(dynamicType.getTypeDescription().getName(), classLoader, this.identification, injectingInitializer);
                    }
                }
            }

            public static class Eager extends SelfInjection {
                public Eager() {
                    this(new NexusAccessor());
                }

                public Eager(NexusAccessor nexusAccessor) {
                    super(nexusAccessor);
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection
                protected Dispatcher dispatcher(int i) {
                    return new Dispatcher(this.nexusAccessor, i);
                }

                protected static class Dispatcher extends Dispatcher {
                    protected Dispatcher(NexusAccessor nexusAccessor, int i) {
                        super(nexusAccessor, i);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.Dispatcher
                    public void register(DynamicType dynamicType, ClassLoader classLoader, Dispatcher.InjectorFactory injectorFactory) {
                        Map<TypeDescription, byte[]> auxiliaryTypes = dynamicType.getAuxiliaryTypes();
                        Map<TypeDescription, LoadedTypeInitializer> loadedTypeInitializers = dynamicType.getLoadedTypeInitializers();
                        if (!auxiliaryTypes.isEmpty()) {
                            for (Map.Entry<TypeDescription, Class<?>> entry : injectorFactory.resolve().inject(auxiliaryTypes).entrySet()) {
                                loadedTypeInitializers.get(entry.getKey()).onLoad(entry.getValue());
                            }
                        }
                        this.nexusAccessor.register(dynamicType.getTypeDescription().getName(), classLoader, this.identification, loadedTypeInitializers.get(dynamicType.getTypeDescription()));
                    }
                }
            }
        }
    }

    public interface DescriptionStrategy {
        TypeDescription apply(String str, Class<?> cls, TypePool typePool, CircularityLock circularityLock, ClassLoader classLoader, JavaModule javaModule);

        boolean isLoadedFirst();

        public enum Default implements DescriptionStrategy {
            HYBRID(true) { // from class: org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.DescriptionStrategy.Default.1
                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.DescriptionStrategy
                public TypeDescription apply(String str, Class<?> cls, TypePool typePool, CircularityLock circularityLock, ClassLoader classLoader, JavaModule javaModule) {
                    if (cls == null) {
                        return typePool.describe(str).resolve();
                    }
                    return TypeDescription.ForLoadedType.of(cls);
                }
            },
            POOL_ONLY(0 == true ? 1 : 0) { // from class: org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.DescriptionStrategy.Default.2
                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.DescriptionStrategy
                public TypeDescription apply(String str, Class<?> cls, TypePool typePool, CircularityLock circularityLock, ClassLoader classLoader, JavaModule javaModule) {
                    return typePool.describe(str).resolve();
                }
            },
            POOL_FIRST(0 == true ? 1 : 0) { // from class: org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.DescriptionStrategy.Default.3
                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.DescriptionStrategy
                public TypeDescription apply(String str, Class<?> cls, TypePool typePool, CircularityLock circularityLock, ClassLoader classLoader, JavaModule javaModule) {
                    TypePool.Resolution describe = typePool.describe(str);
                    if (describe.isResolved() || cls == null) {
                        return describe.resolve();
                    }
                    return TypeDescription.ForLoadedType.of(cls);
                }
            };

            private final boolean loadedFirst;

            /* synthetic */ Default(boolean z, AnonymousClass1 anonymousClass1) {
                this(z);
            }

            Default(boolean z) {
                this.loadedFirst = z;
            }

            public DescriptionStrategy withSuperTypeLoading() {
                return new SuperTypeLoading(this);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.DescriptionStrategy
            public boolean isLoadedFirst() {
                return this.loadedFirst;
            }

            public DescriptionStrategy withSuperTypeLoading(ExecutorService executorService) {
                return new SuperTypeLoading.Asynchronous(this, executorService);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class SuperTypeLoading implements DescriptionStrategy {
            private final DescriptionStrategy delegate;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.delegate.equals(((SuperTypeLoading) obj).delegate);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.delegate.hashCode();
            }

            public SuperTypeLoading(DescriptionStrategy descriptionStrategy) {
                this.delegate = descriptionStrategy;
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.DescriptionStrategy
            public boolean isLoadedFirst() {
                return this.delegate.isLoadedFirst();
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.DescriptionStrategy
            public TypeDescription apply(String str, Class<?> cls, TypePool typePool, CircularityLock circularityLock, ClassLoader classLoader, JavaModule javaModule) {
                TypeDescription apply = this.delegate.apply(str, cls, typePool, circularityLock, classLoader, javaModule);
                return apply instanceof TypeDescription.ForLoadedType ? apply : new TypeDescription.SuperTypeLoading(apply, classLoader, new UnlockingClassLoadingDelegate(circularityLock));
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static class UnlockingClassLoadingDelegate implements TypeDescription.SuperTypeLoading.ClassLoadingDelegate {
                private final CircularityLock circularityLock;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.circularityLock.equals(((UnlockingClassLoadingDelegate) obj).circularityLock);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.circularityLock.hashCode();
                }

                protected UnlockingClassLoadingDelegate(CircularityLock circularityLock) {
                    this.circularityLock = circularityLock;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.SuperTypeLoading.ClassLoadingDelegate
                public Class<?> load(String str, ClassLoader classLoader) throws ClassNotFoundException {
                    this.circularityLock.release();
                    try {
                        return Class.forName(str, false, classLoader);
                    } finally {
                        this.circularityLock.acquire();
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class Asynchronous implements DescriptionStrategy {
                private final DescriptionStrategy delegate;
                private final ExecutorService executorService;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Asynchronous asynchronous = (Asynchronous) obj;
                    return this.delegate.equals(asynchronous.delegate) && this.executorService.equals(asynchronous.executorService);
                }

                public int hashCode() {
                    return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.delegate.hashCode()) * 31) + this.executorService.hashCode();
                }

                public Asynchronous(DescriptionStrategy descriptionStrategy, ExecutorService executorService) {
                    this.delegate = descriptionStrategy;
                    this.executorService = executorService;
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.DescriptionStrategy
                public boolean isLoadedFirst() {
                    return this.delegate.isLoadedFirst();
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.DescriptionStrategy
                public TypeDescription apply(String str, Class<?> cls, TypePool typePool, CircularityLock circularityLock, ClassLoader classLoader, JavaModule javaModule) {
                    TypeDescription apply = this.delegate.apply(str, cls, typePool, circularityLock, classLoader, javaModule);
                    return apply instanceof TypeDescription.ForLoadedType ? apply : new TypeDescription.SuperTypeLoading(apply, classLoader, new ThreadSwitchingClassLoadingDelegate(this.executorService));
                }

                @HashCodeAndEqualsPlugin.Enhance
                protected static class ThreadSwitchingClassLoadingDelegate implements TypeDescription.SuperTypeLoading.ClassLoadingDelegate {
                    private final ExecutorService executorService;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.executorService.equals(((ThreadSwitchingClassLoadingDelegate) obj).executorService);
                    }

                    public int hashCode() {
                        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.executorService.hashCode();
                    }

                    protected ThreadSwitchingClassLoadingDelegate(ExecutorService executorService) {
                        this.executorService = executorService;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.SuperTypeLoading.ClassLoadingDelegate
                    public Class<?> load(String str, ClassLoader classLoader) throws ClassNotFoundException {
                        boolean z = classLoader != null && Thread.holdsLock(classLoader);
                        AtomicBoolean atomicBoolean = new AtomicBoolean(z);
                        Future submit = this.executorService.submit(z ? new NotifyingClassLoadingAction(str, classLoader, atomicBoolean) : new SimpleClassLoadingAction(str, classLoader));
                        while (z) {
                            try {
                                if (!atomicBoolean.get()) {
                                    break;
                                }
                                classLoader.wait();
                            } catch (ExecutionException e) {
                                throw new IllegalStateException("Could not load " + str + " asynchronously", e.getCause());
                            } catch (Exception e2) {
                                throw new IllegalStateException("Could not load " + str + " asynchronously", e2);
                            }
                        }
                        return (Class) submit.get();
                    }

                    @HashCodeAndEqualsPlugin.Enhance
                    protected static class SimpleClassLoadingAction implements Callable<Class<?>> {
                        private final ClassLoader classLoader;
                        private final String name;

                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj == null || getClass() != obj.getClass()) {
                                return false;
                            }
                            SimpleClassLoadingAction simpleClassLoadingAction = (SimpleClassLoadingAction) obj;
                            return this.name.equals(simpleClassLoadingAction.name) && this.classLoader.equals(simpleClassLoadingAction.classLoader);
                        }

                        public int hashCode() {
                            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.name.hashCode()) * 31) + this.classLoader.hashCode();
                        }

                        protected SimpleClassLoadingAction(String str, ClassLoader classLoader) {
                            this.name = str;
                            this.classLoader = classLoader;
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // java.util.concurrent.Callable
                        public Class<?> call() throws ClassNotFoundException {
                            return Class.forName(this.name, false, this.classLoader);
                        }
                    }

                    protected static class NotifyingClassLoadingAction implements Callable<Class<?>> {
                        private final ClassLoader classLoader;
                        private final String name;
                        private final AtomicBoolean signal;

                        protected NotifyingClassLoadingAction(String str, ClassLoader classLoader, AtomicBoolean atomicBoolean) {
                            this.name = str;
                            this.classLoader = classLoader;
                            this.signal = atomicBoolean;
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // java.util.concurrent.Callable
                        public Class<?> call() throws ClassNotFoundException {
                            Class<?> cls;
                            synchronized (this.classLoader) {
                                try {
                                    cls = Class.forName(this.name, false, this.classLoader);
                                } finally {
                                    this.signal.set(false);
                                    this.classLoader.notifyAll();
                                }
                            }
                            return cls;
                        }
                    }
                }
            }
        }
    }

    public interface LocationStrategy {
        ClassFileLocator classFileLocator(ClassLoader classLoader, JavaModule javaModule);

        public enum NoOp implements LocationStrategy {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.LocationStrategy
            public ClassFileLocator classFileLocator(ClassLoader classLoader, JavaModule javaModule) {
                return ClassFileLocator.NoOp.INSTANCE;
            }
        }

        public enum ForClassLoader implements LocationStrategy {
            STRONG { // from class: org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.LocationStrategy.ForClassLoader.1
                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.LocationStrategy
                public ClassFileLocator classFileLocator(ClassLoader classLoader, JavaModule javaModule) {
                    return ClassFileLocator.ForClassLoader.of(classLoader);
                }
            },
            WEAK { // from class: org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.LocationStrategy.ForClassLoader.2
                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.LocationStrategy
                public ClassFileLocator classFileLocator(ClassLoader classLoader, JavaModule javaModule) {
                    return ClassFileLocator.ForClassLoader.WeaklyReferenced.of(classLoader);
                }
            };

            /* synthetic */ ForClassLoader(AnonymousClass1 anonymousClass1) {
                this();
            }

            public LocationStrategy withFallbackTo(ClassFileLocator... classFileLocatorArr) {
                return withFallbackTo((Collection<? extends ClassFileLocator>) Arrays.asList(classFileLocatorArr));
            }

            public LocationStrategy withFallbackTo(Collection<? extends ClassFileLocator> collection) {
                ArrayList arrayList = new ArrayList(collection.size());
                Iterator<? extends ClassFileLocator> it = collection.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Simple(it.next()));
                }
                return withFallbackTo((List<? extends LocationStrategy>) arrayList);
            }

            public LocationStrategy withFallbackTo(LocationStrategy... locationStrategyArr) {
                return withFallbackTo(Arrays.asList(locationStrategyArr));
            }

            public LocationStrategy withFallbackTo(List<? extends LocationStrategy> list) {
                ArrayList arrayList = new ArrayList(list.size() + 1);
                arrayList.add(this);
                arrayList.addAll(list);
                return new Compound(arrayList);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Simple implements LocationStrategy {
            private final ClassFileLocator classFileLocator;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.classFileLocator.equals(((Simple) obj).classFileLocator);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.classFileLocator.hashCode();
            }

            public Simple(ClassFileLocator classFileLocator) {
                this.classFileLocator = classFileLocator;
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.LocationStrategy
            public ClassFileLocator classFileLocator(ClassLoader classLoader, JavaModule javaModule) {
                return this.classFileLocator;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Compound implements LocationStrategy {
            private final List<LocationStrategy> locationStrategies;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.locationStrategies.equals(((Compound) obj).locationStrategies);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.locationStrategies.hashCode();
            }

            public Compound(LocationStrategy... locationStrategyArr) {
                this((List<? extends LocationStrategy>) Arrays.asList(locationStrategyArr));
            }

            public Compound(List<? extends LocationStrategy> list) {
                this.locationStrategies = new ArrayList();
                for (LocationStrategy locationStrategy : list) {
                    if (locationStrategy instanceof Compound) {
                        this.locationStrategies.addAll(((Compound) locationStrategy).locationStrategies);
                    } else if (!(locationStrategy instanceof NoOp)) {
                        this.locationStrategies.add(locationStrategy);
                    }
                }
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.LocationStrategy
            public ClassFileLocator classFileLocator(ClassLoader classLoader, JavaModule javaModule) {
                ArrayList arrayList = new ArrayList(this.locationStrategies.size());
                Iterator<LocationStrategy> it = this.locationStrategies.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().classFileLocator(classLoader, javaModule));
                }
                return new ClassFileLocator.Compound(arrayList);
            }
        }
    }

    public interface FallbackStrategy {
        boolean isFallback(Class<?> cls, Throwable th);

        public enum Simple implements FallbackStrategy {
            ENABLED(true),
            DISABLED(false);

            private final boolean enabled;

            Simple(boolean z) {
                this.enabled = z;
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.FallbackStrategy
            public boolean isFallback(Class<?> cls, Throwable th) {
                return this.enabled;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ByThrowableType implements FallbackStrategy {
            private final Set<? extends Class<? extends Throwable>> types;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.types.equals(((ByThrowableType) obj).types);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.types.hashCode();
            }

            public ByThrowableType(Class<? extends Throwable>... clsArr) {
                this(new HashSet(Arrays.asList(clsArr)));
            }

            public ByThrowableType(Set<? extends Class<? extends Throwable>> set) {
                this.types = set;
            }

            public static FallbackStrategy ofOptionalTypes() {
                return new ByThrowableType((Class<? extends Throwable>[]) new Class[]{LinkageError.class, TypeNotPresentException.class});
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.FallbackStrategy
            public boolean isFallback(Class<?> cls, Throwable th) {
                Iterator<? extends Class<? extends Throwable>> it = this.types.iterator();
                while (it.hasNext()) {
                    if (it.next().isInstance(th)) {
                        return true;
                    }
                }
                return false;
            }
        }
    }

    public interface InstallationListener {
        public static final Throwable SUPPRESS_ERROR = null;

        public static abstract class Adapter implements InstallationListener {
            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onBeforeInstall(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer) {
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public Throwable onError(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer, Throwable th) {
                return th;
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onInstall(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer) {
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onReset(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer) {
            }
        }

        public enum NoOp implements InstallationListener {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onBeforeInstall(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer) {
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public Throwable onError(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer, Throwable th) {
                return th;
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onInstall(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer) {
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onReset(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer) {
            }
        }

        void onBeforeInstall(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer);

        Throwable onError(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer, Throwable th);

        void onInstall(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer);

        void onReset(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer);

        public enum ErrorSuppressing implements InstallationListener {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onBeforeInstall(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer) {
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onInstall(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer) {
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onReset(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer) {
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public Throwable onError(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer, Throwable th) {
                return SUPPRESS_ERROR;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class StreamWriting implements InstallationListener {
            protected static final String PREFIX = "[Byte Buddy]";
            private final PrintStream printStream;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.printStream.equals(((StreamWriting) obj).printStream);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.printStream.hashCode();
            }

            public StreamWriting(PrintStream printStream) {
                this.printStream = printStream;
            }

            public static InstallationListener toSystemOut() {
                return new StreamWriting(System.out);
            }

            public static InstallationListener toSystemError() {
                return new StreamWriting(System.err);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onBeforeInstall(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer) {
                this.printStream.printf("[Byte Buddy] BEFORE_INSTALL %s on %s%n", resettableClassFileTransformer, instrumentation);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onInstall(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer) {
                this.printStream.printf("[Byte Buddy] INSTALL %s on %s%n", resettableClassFileTransformer, instrumentation);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public Throwable onError(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer, Throwable th) {
                synchronized (this.printStream) {
                    this.printStream.printf("[Byte Buddy] ERROR %s on %s%n", resettableClassFileTransformer, instrumentation);
                    th.printStackTrace(this.printStream);
                }
                return th;
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onReset(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer) {
                this.printStream.printf("[Byte Buddy] RESET %s on %s%n", resettableClassFileTransformer, instrumentation);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Compound implements InstallationListener {
            private final List<InstallationListener> installationListeners;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.installationListeners.equals(((Compound) obj).installationListeners);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.installationListeners.hashCode();
            }

            public Compound(InstallationListener... installationListenerArr) {
                this((List<? extends InstallationListener>) Arrays.asList(installationListenerArr));
            }

            public Compound(List<? extends InstallationListener> list) {
                this.installationListeners = new ArrayList();
                for (InstallationListener installationListener : list) {
                    if (installationListener instanceof Compound) {
                        this.installationListeners.addAll(((Compound) installationListener).installationListeners);
                    } else if (!(installationListener instanceof NoOp)) {
                        this.installationListeners.add(installationListener);
                    }
                }
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onBeforeInstall(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer) {
                Iterator<InstallationListener> it = this.installationListeners.iterator();
                while (it.hasNext()) {
                    it.next().onBeforeInstall(instrumentation, resettableClassFileTransformer);
                }
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onInstall(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer) {
                Iterator<InstallationListener> it = this.installationListeners.iterator();
                while (it.hasNext()) {
                    it.next().onInstall(instrumentation, resettableClassFileTransformer);
                }
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public Throwable onError(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer, Throwable th) {
                for (InstallationListener installationListener : this.installationListeners) {
                    if (th == SUPPRESS_ERROR) {
                        return SUPPRESS_ERROR;
                    }
                    th = installationListener.onError(instrumentation, resettableClassFileTransformer, th);
                }
                return th;
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InstallationListener
            public void onReset(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer) {
                Iterator<InstallationListener> it = this.installationListeners.iterator();
                while (it.hasNext()) {
                    it.next().onReset(instrumentation, resettableClassFileTransformer);
                }
            }
        }
    }

    public interface ClassFileBufferStrategy {
        ClassFileLocator resolve(String str, byte[] bArr, ClassLoader classLoader, JavaModule javaModule, ProtectionDomain protectionDomain);

        public enum Default implements ClassFileBufferStrategy {
            RETAINING { // from class: org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.ClassFileBufferStrategy.Default.1
                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.ClassFileBufferStrategy
                public ClassFileLocator resolve(String str, byte[] bArr, ClassLoader classLoader, JavaModule javaModule, ProtectionDomain protectionDomain) {
                    return ClassFileLocator.Simple.of(str, bArr);
                }
            },
            DISCARDING { // from class: org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.ClassFileBufferStrategy.Default.2
                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.ClassFileBufferStrategy
                public ClassFileLocator resolve(String str, byte[] bArr, ClassLoader classLoader, JavaModule javaModule, ProtectionDomain protectionDomain) {
                    return ClassFileLocator.NoOp.INSTANCE;
                }
            };

            /* synthetic */ Default(AnonymousClass1 anonymousClass1) {
                this();
            }
        }
    }

    public enum RedefinitionStrategy {
        DISABLED(0 == true ? 1 : 0, 0 == true ? 1 : 0) { // from class: org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.1
            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy
            public void apply(Instrumentation instrumentation, Listener listener, CircularityLock circularityLock, PoolStrategy poolStrategy, LocationStrategy locationStrategy, DiscoveryStrategy discoveryStrategy, BatchAllocator batchAllocator, Listener listener2, LambdaInstrumentationStrategy lambdaInstrumentationStrategy, DescriptionStrategy descriptionStrategy, FallbackStrategy fallbackStrategy, RawMatcher rawMatcher, RawMatcher rawMatcher2) {
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy
            protected void check(Instrumentation instrumentation) {
                throw new IllegalStateException("Cannot apply redefinition on disabled strategy");
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy
            protected Collector make() {
                throw new IllegalStateException("A disabled redefinition strategy cannot create a collector");
            }
        },
        REDEFINITION(1 == true ? 1 : 0, 0 == true ? 1 : 0) { // from class: org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.2
            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy
            protected void check(Instrumentation instrumentation) {
                if (!instrumentation.isRedefineClassesSupported()) {
                    throw new IllegalStateException("Cannot apply redefinition on " + instrumentation);
                }
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy
            protected Collector make() {
                return new Collector.ForRedefinition();
            }
        },
        RETRANSFORMATION(1 == true ? 1 : 0, 1 == true ? 1 : 0) { // from class: org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.3
            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy
            protected void check(Instrumentation instrumentation) {
                if (!instrumentation.isRetransformClassesSupported()) {
                    throw new IllegalStateException("Cannot apply redefinition on " + instrumentation);
                }
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy
            protected Collector make() {
                return new Collector.ForRetransformation();
            }
        };

        private final boolean enabled;
        private final boolean retransforming;

        protected abstract void check(Instrumentation instrumentation);

        protected abstract Collector make();

        /* synthetic */ RedefinitionStrategy(boolean z, boolean z2, AnonymousClass1 anonymousClass1) {
            this(z, z2);
        }

        RedefinitionStrategy(boolean z, boolean z2) {
            this.enabled = z;
            this.retransforming = z2;
        }

        protected boolean isRetransforming() {
            return this.retransforming;
        }

        protected boolean isEnabled() {
            return this.enabled;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00ca A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void apply(Instrumentation instrumentation, Listener listener, CircularityLock circularityLock, PoolStrategy poolStrategy, LocationStrategy locationStrategy, DiscoveryStrategy discoveryStrategy, BatchAllocator batchAllocator, Listener listener2, LambdaInstrumentationStrategy lambdaInstrumentationStrategy, DescriptionStrategy descriptionStrategy, FallbackStrategy fallbackStrategy, RawMatcher rawMatcher, RawMatcher rawMatcher2) {
            Class<?> cls;
            boolean z;
            JavaModule javaModule;
            TypePool typePool;
            boolean z2;
            JavaModule javaModule2;
            Class<?> cls2;
            TypeDescription apply;
            Listener listener3 = listener;
            check(instrumentation);
            int i = 0;
            for (Iterable<Class<?>> iterable : discoveryStrategy.resolve(instrumentation)) {
                Collector make = make();
                for (Class<?> cls3 : iterable) {
                    if (cls3 != null && !cls3.isArray()) {
                        if (lambdaInstrumentationStrategy.isInstrumented(cls3)) {
                            JavaModule ofType = JavaModule.ofType(cls3);
                            try {
                                TypePool typePool2 = poolStrategy.typePool(locationStrategy.classFileLocator(cls3.getClassLoader(), ofType), cls3.getClassLoader());
                                try {
                                    typePool = typePool2;
                                    try {
                                        apply = descriptionStrategy.apply(TypeDescription.ForLoadedType.getName(cls3), cls3, typePool2, circularityLock, cls3.getClassLoader(), ofType);
                                        z2 = true;
                                        javaModule2 = ofType;
                                        cls2 = cls3;
                                    } catch (Throwable th) {
                                        th = th;
                                        z2 = true;
                                        javaModule2 = ofType;
                                        cls2 = cls3;
                                        try {
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                        if (!descriptionStrategy.isLoadedFirst()) {
                                            try {
                                            } catch (Throwable th3) {
                                                th = th3;
                                                cls = cls2;
                                                javaModule = javaModule2;
                                                z = z2;
                                                try {
                                                    try {
                                                        listener.onError(TypeDescription.ForLoadedType.getName(cls), cls.getClassLoader(), javaModule, true, th);
                                                        listener3.onComplete(TypeDescription.ForLoadedType.getName(cls), cls.getClassLoader(), javaModule, z);
                                                    } catch (Throwable unused) {
                                                        continue;
                                                    }
                                                } catch (Throwable th4) {
                                                    listener3.onComplete(TypeDescription.ForLoadedType.getName(cls), cls.getClassLoader(), javaModule, z);
                                                    throw th4;
                                                }
                                            }
                                            if (fallbackStrategy.isFallback(cls2, th)) {
                                                cls = cls2;
                                                javaModule = javaModule2;
                                                z = z2;
                                                try {
                                                    make.consider(rawMatcher, rawMatcher2, listener, typePool.describe(TypeDescription.ForLoadedType.getName(cls2)).resolve(), cls, javaModule);
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    listener.onError(TypeDescription.ForLoadedType.getName(cls), cls.getClassLoader(), javaModule, true, th);
                                                    listener3.onComplete(TypeDescription.ForLoadedType.getName(cls), cls.getClassLoader(), javaModule, z);
                                                }
                                            }
                                        }
                                        cls = cls2;
                                        javaModule = javaModule2;
                                        z = z2;
                                        throw th;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    typePool = typePool2;
                                }
                                try {
                                    make.consider(rawMatcher, rawMatcher2, listener, apply, cls3, cls2, javaModule2, !instrumentation.isModifiableClass(cls3));
                                } catch (Throwable th7) {
                                    th = th7;
                                    if (!descriptionStrategy.isLoadedFirst()) {
                                    }
                                    cls = cls2;
                                    javaModule = javaModule2;
                                    z = z2;
                                    throw th;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                cls = cls3;
                                z = true;
                                javaModule = ofType;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                i = make.apply(instrumentation, circularityLock, locationStrategy, listener, batchAllocator, listener2, i);
                listener3 = listener;
            }
        }

        public interface BatchAllocator {
            public static final int FIRST_BATCH = 0;

            Iterable<? extends List<Class<?>>> batch(List<Class<?>> list);

            public enum ForTotal implements BatchAllocator {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.BatchAllocator
                public Iterable<? extends List<Class<?>>> batch(List<Class<?>> list) {
                    if (list.isEmpty()) {
                        return Collections.emptySet();
                    }
                    return Collections.singleton(list);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForFixedSize implements BatchAllocator {
                private final int size;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.size == ((ForFixedSize) obj).size;
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.size;
                }

                protected ForFixedSize(int i) {
                    this.size = i;
                }

                public static BatchAllocator ofSize(int i) {
                    if (i > 0) {
                        return new ForFixedSize(i);
                    }
                    if (i == 0) {
                        return ForTotal.INSTANCE;
                    }
                    throw new IllegalArgumentException("Cannot define a batch with a negative size: " + i);
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.BatchAllocator
                public Iterable<? extends List<Class<?>>> batch(List<Class<?>> list) {
                    ArrayList arrayList = new ArrayList();
                    int i = 0;
                    while (i < list.size()) {
                        arrayList.add(new ArrayList(list.subList(i, Math.min(list.size(), this.size + i))));
                        i += this.size;
                    }
                    return arrayList;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForMatchedGrouping implements BatchAllocator {
                private final Collection<? extends ElementMatcher<? super TypeDescription>> matchers;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.matchers.equals(((ForMatchedGrouping) obj).matchers);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.matchers.hashCode();
                }

                public ForMatchedGrouping(ElementMatcher<? super TypeDescription>... elementMatcherArr) {
                    this(new LinkedHashSet(Arrays.asList(elementMatcherArr)));
                }

                public ForMatchedGrouping(Collection<? extends ElementMatcher<? super TypeDescription>> collection) {
                    this.matchers = collection;
                }

                public BatchAllocator withMinimum(int i) {
                    return Slicing.withMinimum(i, this);
                }

                public BatchAllocator withMaximum(int i) {
                    return Slicing.withMaximum(i, this);
                }

                public BatchAllocator withinRange(int i, int i2) {
                    return Slicing.withinRange(i, i2, this);
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.BatchAllocator
                public Iterable<? extends List<Class<?>>> batch(List<Class<?>> list) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    ArrayList arrayList = new ArrayList();
                    Iterator<? extends ElementMatcher<? super TypeDescription>> it = this.matchers.iterator();
                    while (it.hasNext()) {
                        linkedHashMap.put(it.next(), new ArrayList());
                    }
                    for (Class<?> cls : list) {
                        Iterator<? extends ElementMatcher<? super TypeDescription>> it2 = this.matchers.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                ElementMatcher<? super TypeDescription> next = it2.next();
                                if (next.matches(TypeDescription.ForLoadedType.of(cls))) {
                                    ((List) linkedHashMap.get(next)).add(cls);
                                    break;
                                }
                            } else {
                                arrayList.add(cls);
                                break;
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(this.matchers.size() + 1);
                    for (List list2 : linkedHashMap.values()) {
                        if (!list2.isEmpty()) {
                            arrayList2.add(list2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        arrayList2.add(arrayList);
                    }
                    return arrayList2;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class Slicing implements BatchAllocator {
                private final BatchAllocator batchAllocator;
                private final int maximum;
                private final int minimum;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Slicing slicing = (Slicing) obj;
                    return this.minimum == slicing.minimum && this.maximum == slicing.maximum && this.batchAllocator.equals(slicing.batchAllocator);
                }

                public int hashCode() {
                    return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.minimum) * 31) + this.maximum) * 31) + this.batchAllocator.hashCode();
                }

                protected Slicing(int i, int i2, BatchAllocator batchAllocator) {
                    this.minimum = i;
                    this.maximum = i2;
                    this.batchAllocator = batchAllocator;
                }

                public static BatchAllocator withMinimum(int i, BatchAllocator batchAllocator) {
                    return withinRange(i, Integer.MAX_VALUE, batchAllocator);
                }

                public static BatchAllocator withMaximum(int i, BatchAllocator batchAllocator) {
                    return withinRange(1, i, batchAllocator);
                }

                public static BatchAllocator withinRange(int i, int i2, BatchAllocator batchAllocator) {
                    if (i <= 0) {
                        throw new IllegalArgumentException("Minimum must be a positive number: " + i);
                    }
                    if (i > i2) {
                        throw new IllegalArgumentException("Minimum must not be bigger than maximum: " + i + " >" + i2);
                    }
                    return new Slicing(i, i2, batchAllocator);
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.BatchAllocator
                public Iterable<? extends List<Class<?>>> batch(List<Class<?>> list) {
                    return new SlicingIterable(this.minimum, this.maximum, this.batchAllocator.batch(list));
                }

                protected static class SlicingIterable implements Iterable<List<Class<?>>> {
                    private final Iterable<? extends List<Class<?>>> iterable;
                    private final int maximum;
                    private final int minimum;

                    protected SlicingIterable(int i, int i2, Iterable<? extends List<Class<?>>> iterable) {
                        this.minimum = i;
                        this.maximum = i2;
                        this.iterable = iterable;
                    }

                    @Override // java.lang.Iterable
                    public Iterator<List<Class<?>>> iterator() {
                        return new SlicingIterator(this.minimum, this.maximum, this.iterable.iterator());
                    }

                    protected static class SlicingIterator implements Iterator<List<Class<?>>> {
                        private List<Class<?>> buffer = new ArrayList();
                        private final Iterator<? extends List<Class<?>>> iterator;
                        private final int maximum;
                        private final int minimum;

                        protected SlicingIterator(int i, int i2, Iterator<? extends List<Class<?>>> it) {
                            this.minimum = i;
                            this.maximum = i2;
                            this.iterator = it;
                        }

                        @Override // java.util.Iterator
                        public boolean hasNext() {
                            return !this.buffer.isEmpty() || this.iterator.hasNext();
                        }

                        @Override // java.util.Iterator
                        public List<Class<?>> next() {
                            if (this.buffer.isEmpty()) {
                                this.buffer = this.iterator.next();
                            }
                            while (this.buffer.size() < this.minimum && this.iterator.hasNext()) {
                                this.buffer.addAll(this.iterator.next());
                            }
                            int size = this.buffer.size();
                            int i = this.maximum;
                            if (size > i) {
                                try {
                                    return this.buffer.subList(0, i);
                                } finally {
                                    List<Class<?>> list = this.buffer;
                                    this.buffer = new ArrayList(list.subList(this.maximum, list.size()));
                                }
                            }
                            try {
                                return this.buffer;
                            } finally {
                                this.buffer = new ArrayList();
                            }
                        }

                        @Override // java.util.Iterator
                        public void remove() {
                            throw new UnsupportedOperationException("remove");
                        }
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class Partitioning implements BatchAllocator {
                private final int parts;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.parts == ((Partitioning) obj).parts;
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.parts;
                }

                protected Partitioning(int i) {
                    this.parts = i;
                }

                public static BatchAllocator of(int i) {
                    if (i < 1) {
                        throw new IllegalArgumentException("A batch size must be positive: " + i);
                    }
                    return new Partitioning(i);
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.BatchAllocator
                public Iterable<? extends List<Class<?>>> batch(List<Class<?>> list) {
                    if (list.isEmpty()) {
                        return Collections.emptyList();
                    }
                    ArrayList arrayList = new ArrayList();
                    int size = list.size() / this.parts;
                    int size2 = list.size() % this.parts;
                    int i = size2;
                    while (i < list.size()) {
                        int i2 = i + size;
                        arrayList.add(new ArrayList(list.subList(i, i2)));
                        i = i2;
                    }
                    if (arrayList.isEmpty()) {
                        return Collections.singletonList(list);
                    }
                    ((List) arrayList.get(0)).addAll(0, list.subList(0, size2));
                    return arrayList;
                }
            }
        }

        public interface Listener {
            void onBatch(int i, List<Class<?>> list, List<Class<?>> list2);

            void onComplete(int i, List<Class<?>> list, Map<List<Class<?>>, Throwable> map);

            Iterable<? extends List<Class<?>>> onError(int i, List<Class<?>> list, Throwable th, List<Class<?>> list2);

            public enum NoOp implements Listener {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                public void onBatch(int i, List<Class<?>> list, List<Class<?>> list2) {
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                public void onComplete(int i, List<Class<?>> list, Map<List<Class<?>>, Throwable> map) {
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                public Iterable<? extends List<Class<?>>> onError(int i, List<Class<?>> list, Throwable th, List<Class<?>> list2) {
                    return Collections.emptyList();
                }
            }

            public enum Yielding implements Listener {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                public void onComplete(int i, List<Class<?>> list, Map<List<Class<?>>, Throwable> map) {
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                public void onBatch(int i, List<Class<?>> list, List<Class<?>> list2) {
                    if (i > 0) {
                        Thread.yield();
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                public Iterable<? extends List<Class<?>>> onError(int i, List<Class<?>> list, Throwable th, List<Class<?>> list2) {
                    return Collections.emptyList();
                }
            }

            public enum ErrorEscalating implements Listener {
                FAIL_FAST { // from class: org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener.ErrorEscalating.1
                    @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                    public void onComplete(int i, List<Class<?>> list, Map<List<Class<?>>, Throwable> map) {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                    public Iterable<? extends List<Class<?>>> onError(int i, List<Class<?>> list, Throwable th, List<Class<?>> list2) {
                        throw new IllegalStateException("Could not transform any of " + list, th);
                    }
                },
                FAIL_LAST { // from class: org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener.ErrorEscalating.2
                    @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                    public Iterable<? extends List<Class<?>>> onError(int i, List<Class<?>> list, Throwable th, List<Class<?>> list2) {
                        return Collections.emptyList();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                    public void onComplete(int i, List<Class<?>> list, Map<List<Class<?>>, Throwable> map) {
                        if (!map.isEmpty()) {
                            throw new IllegalStateException("Could not transform any of " + map);
                        }
                    }
                };

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                public void onBatch(int i, List<Class<?>> list, List<Class<?>> list2) {
                }

                /* synthetic */ ErrorEscalating(AnonymousClass1 anonymousClass1) {
                    this();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static abstract class Adapter implements Listener {
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass();
                }

                public int hashCode() {
                    return 17;
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                public void onBatch(int i, List<Class<?>> list, List<Class<?>> list2) {
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                public void onComplete(int i, List<Class<?>> list, Map<List<Class<?>>, Throwable> map) {
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                public Iterable<? extends List<Class<?>>> onError(int i, List<Class<?>> list, Throwable th, List<Class<?>> list2) {
                    return Collections.emptyList();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class BatchReallocator extends Adapter {
                private final BatchAllocator batchAllocator;

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener.Adapter
                public boolean equals(Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.batchAllocator.equals(((BatchReallocator) obj).batchAllocator);
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener.Adapter
                public int hashCode() {
                    return (super.hashCode() * 31) + this.batchAllocator.hashCode();
                }

                public BatchReallocator(BatchAllocator batchAllocator) {
                    this.batchAllocator = batchAllocator;
                }

                public static Listener splitting() {
                    return new BatchReallocator(new BatchAllocator.Partitioning(2));
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener.Adapter, org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                public Iterable<? extends List<Class<?>>> onError(int i, List<Class<?>> list, Throwable th, List<Class<?>> list2) {
                    if (list.size() < 2) {
                        return Collections.emptyList();
                    }
                    return this.batchAllocator.batch(list);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class Pausing extends Adapter {
                private final long value;

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener.Adapter
                public boolean equals(Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.value == ((Pausing) obj).value;
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener.Adapter
                public int hashCode() {
                    int hashCode = super.hashCode() * 31;
                    long j = this.value;
                    return hashCode + ((int) (j ^ (j >>> 32)));
                }

                protected Pausing(long j) {
                    this.value = j;
                }

                public static Listener of(long j, TimeUnit timeUnit) {
                    if (j > 0) {
                        return new Pausing(timeUnit.toMillis(j));
                    }
                    if (j == 0) {
                        return NoOp.INSTANCE;
                    }
                    throw new IllegalArgumentException("Cannot sleep for a non-positive amount of time: " + j);
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener.Adapter, org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                public void onBatch(int i, List<Class<?>> list, List<Class<?>> list2) {
                    if (i > 0) {
                        try {
                            Thread.sleep(this.value);
                        } catch (InterruptedException e) {
                            throw new RuntimeException("Sleep was interrupted", e);
                        }
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class StreamWriting implements Listener {
                private final PrintStream printStream;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.printStream.equals(((StreamWriting) obj).printStream);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.printStream.hashCode();
                }

                public StreamWriting(PrintStream printStream) {
                    this.printStream = printStream;
                }

                public static Listener toSystemOut() {
                    return new StreamWriting(System.out);
                }

                public static Listener toSystemError() {
                    return new StreamWriting(System.err);
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                public void onBatch(int i, List<Class<?>> list, List<Class<?>> list2) {
                    this.printStream.printf("[Byte Buddy] REDEFINE BATCH #%d [%d of %d type(s)]%n", Integer.valueOf(i), Integer.valueOf(list.size()), Integer.valueOf(list2.size()));
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                public Iterable<? extends List<Class<?>>> onError(int i, List<Class<?>> list, Throwable th, List<Class<?>> list2) {
                    synchronized (this.printStream) {
                        this.printStream.printf("[Byte Buddy] REDEFINE ERROR #%d [%d of %d type(s)]%n", Integer.valueOf(i), Integer.valueOf(list.size()), Integer.valueOf(list2.size()));
                        th.printStackTrace(this.printStream);
                    }
                    return Collections.emptyList();
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                public void onComplete(int i, List<Class<?>> list, Map<List<Class<?>>, Throwable> map) {
                    this.printStream.printf("[Byte Buddy] REDEFINE COMPLETE #%d batch(es) containing %d types [%d failed batch(es)]%n", Integer.valueOf(i), Integer.valueOf(list.size()), Integer.valueOf(map.size()));
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class Compound implements Listener {
                private final List<Listener> listeners;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.listeners.equals(((Compound) obj).listeners);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.listeners.hashCode();
                }

                public Compound(Listener... listenerArr) {
                    this((List<? extends Listener>) Arrays.asList(listenerArr));
                }

                public Compound(List<? extends Listener> list) {
                    this.listeners = new ArrayList();
                    for (Listener listener : list) {
                        if (listener instanceof Compound) {
                            this.listeners.addAll(((Compound) listener).listeners);
                        } else if (!(listener instanceof NoOp)) {
                            this.listeners.add(listener);
                        }
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                public void onBatch(int i, List<Class<?>> list, List<Class<?>> list2) {
                    Iterator<Listener> it = this.listeners.iterator();
                    while (it.hasNext()) {
                        it.next().onBatch(i, list, list2);
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                public Iterable<? extends List<Class<?>>> onError(int i, List<Class<?>> list, Throwable th, List<Class<?>> list2) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<Listener> it = this.listeners.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().onError(i, list, th, list2));
                    }
                    return new CompoundIterable(arrayList);
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener
                public void onComplete(int i, List<Class<?>> list, Map<List<Class<?>>, Throwable> map) {
                    Iterator<Listener> it = this.listeners.iterator();
                    while (it.hasNext()) {
                        it.next().onComplete(i, list, map);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                protected static class CompoundIterable implements Iterable<List<Class<?>>> {
                    private final List<Iterable<? extends List<Class<?>>>> iterables;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.iterables.equals(((CompoundIterable) obj).iterables);
                    }

                    public int hashCode() {
                        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.iterables.hashCode();
                    }

                    protected CompoundIterable(List<Iterable<? extends List<Class<?>>>> list) {
                        this.iterables = list;
                    }

                    @Override // java.lang.Iterable
                    public Iterator<List<Class<?>>> iterator() {
                        return new CompoundIterator(new ArrayList(this.iterables));
                    }

                    protected static class CompoundIterator implements Iterator<List<Class<?>>> {
                        private final List<Iterable<? extends List<Class<?>>>> backlog;
                        private Iterator<? extends List<Class<?>>> current;

                        protected CompoundIterator(List<Iterable<? extends List<Class<?>>>> list) {
                            this.backlog = list;
                            forward();
                        }

                        @Override // java.util.Iterator
                        public boolean hasNext() {
                            Iterator<? extends List<Class<?>>> it = this.current;
                            return it != null && it.hasNext();
                        }

                        @Override // java.util.Iterator
                        public List<Class<?>> next() {
                            try {
                                Iterator<? extends List<Class<?>>> it = this.current;
                                if (it != null) {
                                    return it.next();
                                }
                                throw new NoSuchElementException();
                            } finally {
                                forward();
                            }
                        }

                        private void forward() {
                            while (true) {
                                Iterator<? extends List<Class<?>>> it = this.current;
                                if ((it != null && it.hasNext()) || this.backlog.isEmpty()) {
                                    return;
                                } else {
                                    this.current = this.backlog.remove(0).iterator();
                                }
                            }
                        }

                        @Override // java.util.Iterator
                        public void remove() {
                            throw new UnsupportedOperationException("remove");
                        }
                    }
                }
            }
        }

        public interface DiscoveryStrategy {
            Iterable<Iterable<Class<?>>> resolve(Instrumentation instrumentation);

            public enum SinglePass implements DiscoveryStrategy {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy
                public Iterable<Iterable<Class<?>>> resolve(Instrumentation instrumentation) {
                    return Collections.singleton(Arrays.asList(instrumentation.getAllLoadedClasses()));
                }
            }

            public enum Reiterating implements DiscoveryStrategy {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy
                public Iterable<Iterable<Class<?>>> resolve(Instrumentation instrumentation) {
                    return new ReiteratingIterable(instrumentation);
                }

                @HashCodeAndEqualsPlugin.Enhance
                protected static class ReiteratingIterable implements Iterable<Iterable<Class<?>>> {
                    private final Instrumentation instrumentation;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.instrumentation.equals(((ReiteratingIterable) obj).instrumentation);
                    }

                    public int hashCode() {
                        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.instrumentation.hashCode();
                    }

                    protected ReiteratingIterable(Instrumentation instrumentation) {
                        this.instrumentation = instrumentation;
                    }

                    @Override // java.lang.Iterable
                    public Iterator<Iterable<Class<?>>> iterator() {
                        return new ReiteratingIterator(this.instrumentation);
                    }
                }

                protected static class ReiteratingIterator implements Iterator<Iterable<Class<?>>> {
                    private final Instrumentation instrumentation;
                    private final Set<Class<?>> processed = new HashSet();
                    private List<Class<?>> types;

                    protected ReiteratingIterator(Instrumentation instrumentation) {
                        this.instrumentation = instrumentation;
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        if (this.types == null) {
                            this.types = new ArrayList();
                            for (Class<?> cls : this.instrumentation.getAllLoadedClasses()) {
                                if (cls != null && this.processed.add(cls)) {
                                    this.types.add(cls);
                                }
                            }
                        }
                        return !this.types.isEmpty();
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // java.util.Iterator
                    public Iterable<Class<?>> next() {
                        if (hasNext()) {
                            try {
                                return this.types;
                            } finally {
                                this.types = null;
                            }
                        }
                        throw new NoSuchElementException();
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        throw new UnsupportedOperationException("remove");
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class Explicit implements DiscoveryStrategy {
                private final Set<Class<?>> types;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.types.equals(((Explicit) obj).types);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.types.hashCode();
                }

                public Explicit(Class<?>... clsArr) {
                    this(new LinkedHashSet(Arrays.asList(clsArr)));
                }

                public Explicit(Set<Class<?>> set) {
                    this.types = set;
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy
                public Iterable<Iterable<Class<?>>> resolve(Instrumentation instrumentation) {
                    return Collections.singleton(this.types);
                }
            }
        }

        public interface ResubmissionScheduler {
            boolean isAlive();

            Cancelable schedule(Runnable runnable);

            public interface Cancelable {

                public enum NoOp implements Cancelable {
                    INSTANCE;

                    @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.ResubmissionScheduler.Cancelable
                    public void cancel() {
                    }
                }

                void cancel();

                @HashCodeAndEqualsPlugin.Enhance
                public static class ForFuture implements Cancelable {
                    private final Future<?> future;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.future.equals(((ForFuture) obj).future);
                    }

                    public int hashCode() {
                        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.future.hashCode();
                    }

                    public ForFuture(Future<?> future) {
                        this.future = future;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.ResubmissionScheduler.Cancelable
                    public void cancel() {
                        this.future.cancel(true);
                    }
                }
            }

            public enum NoOp implements ResubmissionScheduler {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.ResubmissionScheduler
                public boolean isAlive() {
                    return false;
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.ResubmissionScheduler
                public Cancelable schedule(Runnable runnable) {
                    return Cancelable.NoOp.INSTANCE;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class AtFixedRate implements ResubmissionScheduler {
                private final ScheduledExecutorService scheduledExecutorService;
                private final long time;
                private final TimeUnit timeUnit;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    AtFixedRate atFixedRate = (AtFixedRate) obj;
                    return this.scheduledExecutorService.equals(atFixedRate.scheduledExecutorService) && this.time == atFixedRate.time && this.timeUnit.equals(atFixedRate.timeUnit);
                }

                public int hashCode() {
                    int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.scheduledExecutorService.hashCode()) * 31;
                    long j = this.time;
                    return ((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.timeUnit.hashCode();
                }

                public AtFixedRate(ScheduledExecutorService scheduledExecutorService, long j, TimeUnit timeUnit) {
                    this.scheduledExecutorService = scheduledExecutorService;
                    this.time = j;
                    this.timeUnit = timeUnit;
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.ResubmissionScheduler
                public boolean isAlive() {
                    return !this.scheduledExecutorService.isShutdown();
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.ResubmissionScheduler
                public Cancelable schedule(Runnable runnable) {
                    ScheduledExecutorService scheduledExecutorService = this.scheduledExecutorService;
                    long j = this.time;
                    return new Cancelable.ForFuture(scheduledExecutorService.scheduleAtFixedRate(runnable, j, j, this.timeUnit));
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class WithFixedDelay implements ResubmissionScheduler {
                private final ScheduledExecutorService scheduledExecutorService;
                private final long time;
                private final TimeUnit timeUnit;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    WithFixedDelay withFixedDelay = (WithFixedDelay) obj;
                    return this.scheduledExecutorService.equals(withFixedDelay.scheduledExecutorService) && this.time == withFixedDelay.time && this.timeUnit.equals(withFixedDelay.timeUnit);
                }

                public int hashCode() {
                    int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.scheduledExecutorService.hashCode()) * 31;
                    long j = this.time;
                    return ((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.timeUnit.hashCode();
                }

                public WithFixedDelay(ScheduledExecutorService scheduledExecutorService, long j, TimeUnit timeUnit) {
                    this.scheduledExecutorService = scheduledExecutorService;
                    this.time = j;
                    this.timeUnit = timeUnit;
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.ResubmissionScheduler
                public boolean isAlive() {
                    return !this.scheduledExecutorService.isShutdown();
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.ResubmissionScheduler
                public Cancelable schedule(Runnable runnable) {
                    ScheduledExecutorService scheduledExecutorService = this.scheduledExecutorService;
                    long j = this.time;
                    return new Cancelable.ForFuture(scheduledExecutorService.scheduleWithFixedDelay(runnable, j, j, this.timeUnit));
                }
            }
        }

        protected interface ResubmissionStrategy {
            Installation apply(Instrumentation instrumentation, LocationStrategy locationStrategy, Listener listener, InstallationListener installationListener, CircularityLock circularityLock, RawMatcher rawMatcher, RedefinitionStrategy redefinitionStrategy, BatchAllocator batchAllocator, Listener listener2);

            public enum Disabled implements ResubmissionStrategy {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.ResubmissionStrategy
                public Installation apply(Instrumentation instrumentation, LocationStrategy locationStrategy, Listener listener, InstallationListener installationListener, CircularityLock circularityLock, RawMatcher rawMatcher, RedefinitionStrategy redefinitionStrategy, BatchAllocator batchAllocator, Listener listener2) {
                    return new Installation(listener, installationListener);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class Enabled implements ResubmissionStrategy {
                private final ElementMatcher<? super Throwable> matcher;
                private final ResubmissionScheduler resubmissionScheduler;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Enabled enabled = (Enabled) obj;
                    return this.resubmissionScheduler.equals(enabled.resubmissionScheduler) && this.matcher.equals(enabled.matcher);
                }

                public int hashCode() {
                    return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.resubmissionScheduler.hashCode()) * 31) + this.matcher.hashCode();
                }

                protected Enabled(ResubmissionScheduler resubmissionScheduler, ElementMatcher<? super Throwable> elementMatcher) {
                    this.resubmissionScheduler = resubmissionScheduler;
                    this.matcher = elementMatcher;
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.ResubmissionStrategy
                public Installation apply(Instrumentation instrumentation, LocationStrategy locationStrategy, Listener listener, InstallationListener installationListener, CircularityLock circularityLock, RawMatcher rawMatcher, RedefinitionStrategy redefinitionStrategy, BatchAllocator batchAllocator, Listener listener2) {
                    if (redefinitionStrategy.isEnabled() && this.resubmissionScheduler.isAlive()) {
                        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                        return new Installation(new Listener.Compound(new ResubmissionListener(this.matcher, concurrentHashMap), listener), new InstallationListener.Compound(new ResubmissionInstallationListener(this.resubmissionScheduler, instrumentation, locationStrategy, listener, circularityLock, rawMatcher, redefinitionStrategy, batchAllocator, listener2, concurrentHashMap), installationListener));
                    }
                    return new Installation(listener, installationListener);
                }

                protected static class ResubmissionListener extends Listener.Adapter {
                    private final ElementMatcher<? super Throwable> matcher;
                    private final ConcurrentMap<StorageKey, Set<String>> types;

                    protected ResubmissionListener(ElementMatcher<? super Throwable> elementMatcher, ConcurrentMap<StorageKey, Set<String>> concurrentMap) {
                        this.matcher = elementMatcher;
                        this.types = concurrentMap;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Listener.Adapter, org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Listener
                    public void onError(String str, ClassLoader classLoader, JavaModule javaModule, boolean z, Throwable th) {
                        Set<String> putIfAbsent;
                        if (z || !this.matcher.matches(th)) {
                            return;
                        }
                        Set<String> set = this.types.get(new LookupKey(classLoader));
                        if (set == null && (putIfAbsent = this.types.putIfAbsent(new StorageKey(classLoader), (set = Collections.newSetFromMap(new ConcurrentHashMap())))) != null) {
                            set = putIfAbsent;
                        }
                        set.add(str);
                    }
                }

                protected static class ResubmissionInstallationListener extends InstallationListener.Adapter implements Runnable {
                    private volatile ResubmissionScheduler.Cancelable cancelable;
                    private final CircularityLock circularityLock;
                    private final Instrumentation instrumentation;
                    private final Listener listener;
                    private final LocationStrategy locationStrategy;
                    private final RawMatcher matcher;
                    private final BatchAllocator redefinitionBatchAllocator;
                    private final Listener redefinitionBatchListener;
                    private final RedefinitionStrategy redefinitionStrategy;
                    private final ResubmissionScheduler resubmissionScheduler;
                    private final ConcurrentMap<StorageKey, Set<String>> types;

                    protected ResubmissionInstallationListener(ResubmissionScheduler resubmissionScheduler, Instrumentation instrumentation, LocationStrategy locationStrategy, Listener listener, CircularityLock circularityLock, RawMatcher rawMatcher, RedefinitionStrategy redefinitionStrategy, BatchAllocator batchAllocator, Listener listener2, ConcurrentMap<StorageKey, Set<String>> concurrentMap) {
                        this.resubmissionScheduler = resubmissionScheduler;
                        this.instrumentation = instrumentation;
                        this.locationStrategy = locationStrategy;
                        this.listener = listener;
                        this.circularityLock = circularityLock;
                        this.matcher = rawMatcher;
                        this.redefinitionStrategy = redefinitionStrategy;
                        this.redefinitionBatchAllocator = batchAllocator;
                        this.redefinitionBatchListener = listener2;
                        this.types = concurrentMap;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InstallationListener.Adapter, org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InstallationListener
                    public void onInstall(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer) {
                        this.cancelable = this.resubmissionScheduler.schedule(this);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InstallationListener.Adapter, org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InstallationListener
                    public void onReset(Instrumentation instrumentation, ResettableClassFileTransformer resettableClassFileTransformer) {
                        ResubmissionScheduler.Cancelable cancelable = this.cancelable;
                        if (cancelable != null) {
                            cancelable.cancel();
                        }
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        boolean acquire = this.circularityLock.acquire();
                        try {
                            Iterator<Map.Entry<StorageKey, Set<String>>> it = this.types.entrySet().iterator();
                            ArrayList arrayList = new ArrayList();
                            while (!Thread.interrupted() && it.hasNext()) {
                                Map.Entry<StorageKey, Set<String>> next = it.next();
                                ClassLoader classLoader = (ClassLoader) next.getKey().get();
                                if (classLoader == null && !next.getKey().isBootstrapLoader()) {
                                    it.remove();
                                }
                                Iterator<String> it2 = next.getValue().iterator();
                                while (it2.hasNext()) {
                                    try {
                                        Class<?> cls = Class.forName(it2.next(), false, classLoader);
                                        try {
                                            if (this.instrumentation.isModifiableClass(cls) && this.matcher.matches(TypeDescription.ForLoadedType.of(cls), cls.getClassLoader(), JavaModule.ofType(cls), cls, cls.getProtectionDomain())) {
                                                arrayList.add(cls);
                                            }
                                        } catch (Throwable th) {
                                            try {
                                                this.listener.onError(TypeDescription.ForLoadedType.getName(cls), cls.getClassLoader(), JavaModule.ofType(cls), true, th);
                                                this.listener.onComplete(TypeDescription.ForLoadedType.getName(cls), cls.getClassLoader(), JavaModule.ofType(cls), true);
                                            } catch (Throwable th2) {
                                                this.listener.onComplete(TypeDescription.ForLoadedType.getName(cls), cls.getClassLoader(), JavaModule.ofType(cls), true);
                                                throw th2;
                                            }
                                        }
                                    } catch (Throwable unused) {
                                        continue;
                                    }
                                    it2.remove();
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                Collector make = this.redefinitionStrategy.make();
                                make.include(arrayList);
                                make.apply(this.instrumentation, this.circularityLock, this.locationStrategy, this.listener, this.redefinitionBatchAllocator, this.redefinitionBatchListener, 0);
                            }
                        } finally {
                            if (acquire) {
                                this.circularityLock.release();
                            }
                        }
                    }
                }

                protected static class LookupKey {
                    private final ClassLoader classLoader;
                    private final int hashCode;

                    protected LookupKey(ClassLoader classLoader) {
                        this.classLoader = classLoader;
                        this.hashCode = System.identityHashCode(classLoader);
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj instanceof LookupKey) {
                            return this.classLoader == ((LookupKey) obj).classLoader;
                        }
                        if (!(obj instanceof StorageKey)) {
                            return false;
                        }
                        StorageKey storageKey = (StorageKey) obj;
                        return this.hashCode == storageKey.hashCode && this.classLoader == storageKey.get();
                    }

                    public int hashCode() {
                        return this.hashCode;
                    }
                }

                protected static class StorageKey extends WeakReference<ClassLoader> {
                    private final int hashCode;

                    protected StorageKey(ClassLoader classLoader) {
                        super(classLoader);
                        this.hashCode = System.identityHashCode(classLoader);
                    }

                    protected boolean isBootstrapLoader() {
                        return this.hashCode == 0;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj instanceof LookupKey) {
                            LookupKey lookupKey = (LookupKey) obj;
                            return this.hashCode == lookupKey.hashCode && get() == lookupKey.classLoader;
                        }
                        if (!(obj instanceof StorageKey)) {
                            return false;
                        }
                        StorageKey storageKey = (StorageKey) obj;
                        return this.hashCode == storageKey.hashCode && get() == storageKey.get();
                    }

                    public int hashCode() {
                        return this.hashCode;
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class Installation {
                private final InstallationListener installationListener;
                private final Listener listener;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Installation installation = (Installation) obj;
                    return this.listener.equals(installation.listener) && this.installationListener.equals(installation.installationListener);
                }

                public int hashCode() {
                    return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.listener.hashCode()) * 31) + this.installationListener.hashCode();
                }

                protected Installation(Listener listener, InstallationListener installationListener) {
                    this.listener = listener;
                    this.installationListener = installationListener;
                }

                protected Listener getListener() {
                    return this.listener;
                }

                protected InstallationListener getInstallationListener() {
                    return this.installationListener;
                }
            }
        }

        protected static abstract class Collector {
            private static final Class<?> NO_LOADED_TYPE = null;
            protected final List<Class<?>> types = new ArrayList();

            protected abstract void doApply(Instrumentation instrumentation, CircularityLock circularityLock, List<Class<?>> list, LocationStrategy locationStrategy, Listener listener) throws UnmodifiableClassException, ClassNotFoundException;

            protected Collector() {
            }

            protected void consider(RawMatcher rawMatcher, RawMatcher rawMatcher2, Listener listener, TypeDescription typeDescription, Class<?> cls, JavaModule javaModule) {
                consider(rawMatcher, rawMatcher2, listener, typeDescription, cls, NO_LOADED_TYPE, javaModule, false);
            }

            /* JADX WARN: Finally extract failed */
            protected void consider(RawMatcher rawMatcher, RawMatcher rawMatcher2, Listener listener, TypeDescription typeDescription, Class<?> cls, Class<?> cls2, JavaModule javaModule, boolean z) {
                if (z || rawMatcher2.matches(typeDescription, cls.getClassLoader(), javaModule, cls2, cls.getProtectionDomain()) || !rawMatcher.matches(typeDescription, cls.getClassLoader(), javaModule, cls2, cls.getProtectionDomain()) || !this.types.add(cls)) {
                    boolean z2 = true;
                    try {
                        try {
                            listener.onIgnored(typeDescription, cls.getClassLoader(), javaModule, cls2 != null);
                            String name = typeDescription.getName();
                            ClassLoader classLoader = cls.getClassLoader();
                            if (cls2 == null) {
                                z2 = false;
                            }
                            listener.onComplete(name, classLoader, javaModule, z2);
                        } catch (Throwable th) {
                            String name2 = typeDescription.getName();
                            ClassLoader classLoader2 = cls.getClassLoader();
                            if (cls2 == null) {
                                z2 = false;
                            }
                            listener.onComplete(name2, classLoader2, javaModule, z2);
                            throw th;
                        }
                    } catch (Throwable unused) {
                    }
                }
            }

            protected void include(List<Class<?>> list) {
                this.types.addAll(list);
            }

            protected int apply(Instrumentation instrumentation, CircularityLock circularityLock, LocationStrategy locationStrategy, Listener listener, BatchAllocator batchAllocator, Listener listener2, int i) {
                HashMap hashMap = new HashMap();
                PrependableIterator prependableIterator = new PrependableIterator(batchAllocator.batch(this.types));
                while (prependableIterator.hasNext()) {
                    List<Class<?>> next = prependableIterator.next();
                    listener2.onBatch(i, next, this.types);
                    try {
                        doApply(instrumentation, circularityLock, next, locationStrategy, listener);
                    } catch (Throwable th) {
                        prependableIterator.prepend(listener2.onError(i, next, th, this.types));
                        hashMap.put(next, th);
                    }
                    i++;
                }
                listener2.onComplete(i, this.types, hashMap);
                return i;
            }

            protected static class PrependableIterator implements Iterator<List<Class<?>>> {
                private final Deque<Iterator<? extends List<Class<?>>>> backlog = new ArrayDeque();
                private Iterator<? extends List<Class<?>>> current;

                protected PrependableIterator(Iterable<? extends List<Class<?>>> iterable) {
                    this.current = iterable.iterator();
                }

                public void prepend(Iterable<? extends List<Class<?>>> iterable) {
                    Iterator<? extends List<Class<?>>> it = iterable.iterator();
                    if (it.hasNext()) {
                        if (this.current.hasNext()) {
                            this.backlog.addLast(this.current);
                        }
                        this.current = it;
                    }
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.current.hasNext();
                }

                @Override // java.util.Iterator
                public List<Class<?>> next() {
                    boolean hasNext;
                    boolean isEmpty;
                    try {
                        while (true) {
                            if (!hasNext) {
                                if (isEmpty) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        return this.current.next();
                    } finally {
                        while (!this.current.hasNext() && !this.backlog.isEmpty()) {
                            this.current = this.backlog.removeLast();
                        }
                    }
                }

                @Override // java.util.Iterator
                public void remove() {
                    throw new UnsupportedOperationException("remove");
                }
            }

            protected static class ForRedefinition extends Collector {
                protected ForRedefinition() {
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Collector
                protected void doApply(Instrumentation instrumentation, CircularityLock circularityLock, List<Class<?>> list, LocationStrategy locationStrategy, Listener listener) throws UnmodifiableClassException, ClassNotFoundException {
                    ArrayList arrayList = new ArrayList(list.size());
                    for (Class<?> cls : list) {
                        try {
                            arrayList.add(new ClassDefinition(cls, locationStrategy.classFileLocator(cls.getClassLoader(), JavaModule.ofType(cls)).locate(TypeDescription.ForLoadedType.getName(cls)).resolve()));
                        } catch (Throwable th) {
                            try {
                                JavaModule ofType = JavaModule.ofType(cls);
                                try {
                                    listener.onError(TypeDescription.ForLoadedType.getName(cls), cls.getClassLoader(), ofType, true, th);
                                    listener.onComplete(TypeDescription.ForLoadedType.getName(cls), cls.getClassLoader(), ofType, true);
                                } catch (Throwable th2) {
                                    listener.onComplete(TypeDescription.ForLoadedType.getName(cls), cls.getClassLoader(), ofType, true);
                                    throw th2;
                                }
                            } catch (Throwable unused) {
                                continue;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    circularityLock.release();
                    try {
                        instrumentation.redefineClasses((ClassDefinition[]) arrayList.toArray(new ClassDefinition[arrayList.size()]));
                    } finally {
                        circularityLock.acquire();
                    }
                }
            }

            protected static class ForRetransformation extends Collector {
                protected ForRetransformation() {
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Collector
                protected void doApply(Instrumentation instrumentation, CircularityLock circularityLock, List<Class<?>> list, LocationStrategy locationStrategy, Listener listener) throws UnmodifiableClassException {
                    if (list.isEmpty()) {
                        return;
                    }
                    circularityLock.release();
                    try {
                        instrumentation.retransformClasses((Class[]) list.toArray(new Class[list.size()]));
                    } finally {
                        circularityLock.acquire();
                    }
                }
            }
        }
    }

    public enum LambdaInstrumentationStrategy {
        ENABLED { // from class: org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy.1
            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy
            protected boolean isInstrumented(Class<?> cls) {
                return true;
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy
            protected void apply(ByteBuddy byteBuddy, Instrumentation instrumentation, ClassFileTransformer classFileTransformer) {
                if (LambdaFactory.register(classFileTransformer, new LambdaInstanceFactory(byteBuddy))) {
                    try {
                        Class<?> cls = Class.forName("java.lang.invoke.LambdaMetafactory");
                        byteBuddy.with(Implementation.Context.Disabled.Factory.INSTANCE).redefine(cls).visit(new AsmVisitorWrapper.ForDeclaredMethods().method(ElementMatchers.named("metafactory"), MetaFactoryRedirection.INSTANCE).method(ElementMatchers.named("altMetafactory"), AlternativeMetaFactoryRedirection.INSTANCE)).make().load(cls.getClassLoader(), ClassReloadingStrategy.of(instrumentation));
                    } catch (ClassNotFoundException unused) {
                    }
                }
            }
        },
        DISABLED { // from class: org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy.2
            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy
            protected void apply(ByteBuddy byteBuddy, Instrumentation instrumentation, ClassFileTransformer classFileTransformer) {
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.LambdaInstrumentationStrategy
            protected boolean isInstrumented(Class<?> cls) {
                return cls == null || !cls.getName().contains("/");
            }
        };

        protected static final MethodVisitor IGNORE_ORIGINAL;
        private static final String UNSAFE_CLASS;

        protected abstract void apply(ByteBuddy byteBuddy, Instrumentation instrumentation, ClassFileTransformer classFileTransformer);

        protected abstract boolean isInstrumented(Class<?> cls);

        /* synthetic */ LambdaInstrumentationStrategy(AnonymousClass1 anonymousClass1) {
            this();
        }

        static {
            UNSAFE_CLASS = ClassFileVersion.ofThisVm(ClassFileVersion.JAVA_V6).isAtLeast(ClassFileVersion.JAVA_V9) ? "jdk/internal/misc/Unsafe" : "sun/misc/Unsafe";
            IGNORE_ORIGINAL = null;
        }

        public static void release(ClassFileTransformer classFileTransformer, Instrumentation instrumentation) {
            if (LambdaFactory.release(classFileTransformer)) {
                try {
                    ClassReloadingStrategy.of(instrumentation).reset(Class.forName("java.lang.invoke.LambdaMetafactory"));
                } catch (Exception e) {
                    throw new IllegalStateException("Could not release lambda transformer", e);
                }
            }
        }

        public static LambdaInstrumentationStrategy of(boolean z) {
            return z ? ENABLED : DISABLED;
        }

        public boolean isEnabled() {
            return this == ENABLED;
        }

        @HashCodeAndEqualsPlugin.Enhance
        protected static class LambdaInstanceFactory {
            private static final String FIELD_PREFIX = "arg$";
            private static final String LAMBDA_FACTORY = "get$Lambda";
            private static final AtomicInteger LAMBDA_NAME_COUNTER = new AtomicInteger();
            private static final String LAMBDA_TYPE_INFIX = "$$Lambda$ByteBuddy$";
            private static final Class<?> NOT_PREVIOUSLY_DEFINED = null;
            private final ByteBuddy byteBuddy;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.byteBuddy.equals(((LambdaInstanceFactory) obj).byteBuddy);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.byteBuddy.hashCode();
            }

            protected LambdaInstanceFactory(ByteBuddy byteBuddy) {
                this.byteBuddy = byteBuddy;
            }

            public byte[] make(Object obj, String str, Object obj2, Object obj3, Object obj4, Object obj5, boolean z, List<Class<?>> list, List<?> list2, Collection<? extends ClassFileTransformer> collection) {
                char c;
                JavaConstant.MethodType ofLoaded = JavaConstant.MethodType.ofLoaded(obj2);
                JavaConstant.MethodType ofLoaded2 = JavaConstant.MethodType.ofLoaded(obj3);
                JavaConstant.MethodHandle ofLoaded3 = JavaConstant.MethodHandle.ofLoaded(obj4, obj);
                JavaConstant.MethodType ofLoaded4 = JavaConstant.MethodType.ofLoaded(obj5);
                Class<?> lookupType = JavaConstant.MethodHandle.lookupType(obj);
                String str2 = lookupType.getName() + LAMBDA_TYPE_INFIX + LAMBDA_NAME_COUNTER.incrementAndGet();
                boolean z2 = false;
                DynamicType.Builder intercept = this.byteBuddy.subclass(ofLoaded.getReturnType(), ConstructorStrategy.Default.NO_CONSTRUCTORS).modifiers(TypeManifestation.FINAL, Visibility.PUBLIC).implement((List<? extends Type>) list).name(str2).defineConstructor(Visibility.PUBLIC).withParameters((Collection<? extends TypeDefinition>) ofLoaded.getParameterTypes()).intercept(ConstructorImplementation.INSTANCE).method(ElementMatchers.named(str).and(ElementMatchers.takesArguments(ofLoaded2.getParameterTypes())).and(ElementMatchers.returns(ofLoaded2.getReturnType()))).intercept(new LambdaMethodImplementation(ofLoaded3, ofLoaded4));
                Iterator it = ofLoaded.getParameterTypes().iterator();
                int i = 0;
                while (it.hasNext()) {
                    i++;
                    intercept = intercept.defineField(FIELD_PREFIX + i, (TypeDescription) it.next(), Visibility.PRIVATE, FieldManifestation.FINAL);
                    z2 = false;
                }
                boolean z3 = z2;
                if (!ofLoaded.getParameterTypes().isEmpty()) {
                    TypeDescription returnType = ofLoaded.getReturnType();
                    ModifierContributor.ForMethod[] forMethodArr = new ModifierContributor.ForMethod[2];
                    forMethodArr[z3 ? 1 : 0] = Visibility.PRIVATE;
                    forMethodArr[1] = Ownership.STATIC;
                    intercept = intercept.defineMethod(LAMBDA_FACTORY, returnType, forMethodArr).withParameters((Collection<? extends TypeDefinition>) ofLoaded.getParameterTypes()).intercept(FactoryImplementation.INSTANCE);
                }
                if (z) {
                    if (list.contains(Serializable.class)) {
                        c = 0;
                    } else {
                        c = 0;
                        intercept = intercept.implement(Serializable.class);
                    }
                    ModifierContributor.ForMethod[] forMethodArr2 = new ModifierContributor.ForMethod[1];
                    forMethodArr2[c] = Visibility.PRIVATE;
                    intercept = intercept.defineMethod("writeReplace", Object.class, forMethodArr2).intercept(new SerializationImplementation(TypeDescription.ForLoadedType.of(lookupType), ofLoaded.getReturnType(), str, ofLoaded2, ofLoaded3, JavaConstant.MethodType.ofLoaded(obj5)));
                } else if (ofLoaded.getReturnType().isAssignableTo(Serializable.class)) {
                    intercept = intercept.defineMethod("readObject", Void.TYPE, Visibility.PRIVATE).withParameters(ObjectInputStream.class).throwing(NotSerializableException.class).intercept(ExceptionMethod.throwing((Class<? extends Throwable>) NotSerializableException.class, "Non-serializable lambda")).defineMethod("writeObject", Void.TYPE, Visibility.PRIVATE).withParameters(ObjectOutputStream.class).throwing(NotSerializableException.class).intercept(ExceptionMethod.throwing((Class<? extends Throwable>) NotSerializableException.class, "Non-serializable lambda"));
                }
                Iterator<?> it2 = list2.iterator();
                while (it2.hasNext()) {
                    JavaConstant.MethodType ofLoaded5 = JavaConstant.MethodType.ofLoaded(it2.next());
                    intercept = intercept.defineMethod(str, ofLoaded5.getReturnType(), MethodManifestation.BRIDGE, Visibility.PUBLIC).withParameters((Collection<? extends TypeDefinition>) ofLoaded5.getParameterTypes()).intercept(new BridgeMethodImplementation(str, ofLoaded2));
                }
                byte[] bytes = intercept.make().getBytes();
                Iterator<? extends ClassFileTransformer> it3 = collection.iterator();
                while (it3.hasNext()) {
                    try {
                        byte[] transform = it3.next().transform(lookupType.getClassLoader(), str2.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/'), NOT_PREVIOUSLY_DEFINED, lookupType.getProtectionDomain(), bytes);
                        if (transform != null) {
                            bytes = transform;
                        }
                    } catch (Throwable unused) {
                    }
                }
                return bytes;
            }

            protected enum ConstructorImplementation implements Implementation {
                INSTANCE;

                private final MethodDescription.InDefinedShape objectConstructor = (MethodDescription.InDefinedShape) TypeDescription.OBJECT.getDeclaredMethods().filter(ElementMatchers.isConstructor()).getOnly();

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                ConstructorImplementation() {
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation
                public ByteCodeAppender appender(Implementation.Target target) {
                    return new Appender(target.getInstrumentedType().getDeclaredFields());
                }

                @HashCodeAndEqualsPlugin.Enhance
                protected static class Appender implements ByteCodeAppender {
                    private final List<FieldDescription.InDefinedShape> declaredFields;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.declaredFields.equals(((Appender) obj).declaredFields);
                    }

                    public int hashCode() {
                        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.declaredFields.hashCode();
                    }

                    protected Appender(List<FieldDescription.InDefinedShape> list) {
                        this.declaredFields = list;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender
                    public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
                        ArrayList arrayList = new ArrayList(this.declaredFields.size() * 3);
                        Iterator it = methodDescription.getParameters().iterator();
                        while (it.hasNext()) {
                            ParameterDescription parameterDescription = (ParameterDescription) it.next();
                            arrayList.add(MethodVariableAccess.loadThis());
                            arrayList.add(MethodVariableAccess.load(parameterDescription));
                            arrayList.add(FieldAccess.forField(this.declaredFields.get(parameterDescription.getIndex())).write());
                        }
                        return new ByteCodeAppender.Size(new StackManipulation.Compound(MethodVariableAccess.loadThis(), MethodInvocation.invoke(ConstructorImplementation.INSTANCE.objectConstructor), new StackManipulation.Compound(arrayList), MethodReturn.VOID).apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
                    }
                }
            }

            protected enum FactoryImplementation implements Implementation {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation
                public ByteCodeAppender appender(Implementation.Target target) {
                    return new Appender(target.getInstrumentedType());
                }

                @HashCodeAndEqualsPlugin.Enhance
                protected static class Appender implements ByteCodeAppender {
                    private final TypeDescription instrumentedType;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.instrumentedType.equals(((Appender) obj).instrumentedType);
                    }

                    public int hashCode() {
                        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.instrumentedType.hashCode();
                    }

                    protected Appender(TypeDescription typeDescription) {
                        this.instrumentedType = typeDescription;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender
                    public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
                        return new ByteCodeAppender.Size(new StackManipulation.Compound(TypeCreation.of(this.instrumentedType), Duplication.SINGLE, MethodVariableAccess.allArgumentsOf(methodDescription), MethodInvocation.invoke((MethodDescription.InDefinedShape) this.instrumentedType.getDeclaredMethods().filter(ElementMatchers.isConstructor()).getOnly()), MethodReturn.REFERENCE).apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static class LambdaMethodImplementation implements Implementation {
                private final JavaConstant.MethodType specializedLambdaMethod;
                private final JavaConstant.MethodHandle targetMethod;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    LambdaMethodImplementation lambdaMethodImplementation = (LambdaMethodImplementation) obj;
                    return this.targetMethod.equals(lambdaMethodImplementation.targetMethod) && this.specializedLambdaMethod.equals(lambdaMethodImplementation.specializedLambdaMethod);
                }

                public int hashCode() {
                    return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.targetMethod.hashCode()) * 31) + this.specializedLambdaMethod.hashCode();
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                protected LambdaMethodImplementation(JavaConstant.MethodHandle methodHandle, JavaConstant.MethodType methodType) {
                    this.targetMethod = methodHandle;
                    this.specializedLambdaMethod = methodType;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation
                public ByteCodeAppender appender(Implementation.Target target) {
                    return new Appender((MethodDescription) this.targetMethod.getOwnerType().getDeclaredMethods().filter(ElementMatchers.hasMethodName(this.targetMethod.getName()).and(ElementMatchers.returns(this.targetMethod.getReturnType())).and(ElementMatchers.takesArguments(this.targetMethod.getParameterTypes()))).getOnly(), this.specializedLambdaMethod, target.getInstrumentedType().getDeclaredFields());
                }

                @HashCodeAndEqualsPlugin.Enhance
                protected static class Appender implements ByteCodeAppender {
                    private final List<FieldDescription.InDefinedShape> declaredFields;
                    private final JavaConstant.MethodType specializedLambdaMethod;
                    private final MethodDescription targetMethod;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        Appender appender = (Appender) obj;
                        return this.targetMethod.equals(appender.targetMethod) && this.specializedLambdaMethod.equals(appender.specializedLambdaMethod) && this.declaredFields.equals(appender.declaredFields);
                    }

                    public int hashCode() {
                        return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.targetMethod.hashCode()) * 31) + this.specializedLambdaMethod.hashCode()) * 31) + this.declaredFields.hashCode();
                    }

                    protected Appender(MethodDescription methodDescription, JavaConstant.MethodType methodType, List<FieldDescription.InDefinedShape> list) {
                        this.targetMethod = methodDescription;
                        this.specializedLambdaMethod = methodType;
                        this.declaredFields = list;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender
                    public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
                        TypeDescription.Generic returnType;
                        StackManipulation compound = this.targetMethod.isConstructor() ? new StackManipulation.Compound(TypeCreation.of(this.targetMethod.getDeclaringType().asErasure()), Duplication.SINGLE) : StackManipulation.Trivial.INSTANCE;
                        ArrayList arrayList = new ArrayList((this.declaredFields.size() * 2) + 1);
                        for (FieldDescription.InDefinedShape inDefinedShape : this.declaredFields) {
                            arrayList.add(MethodVariableAccess.loadThis());
                            arrayList.add(FieldAccess.forField(inDefinedShape).read());
                        }
                        ArrayList arrayList2 = new ArrayList(methodDescription.getParameters().size() * 2);
                        Iterator it = methodDescription.getParameters().iterator();
                        while (it.hasNext()) {
                            ParameterDescription parameterDescription = (ParameterDescription) it.next();
                            arrayList2.add(MethodVariableAccess.load(parameterDescription));
                            arrayList2.add(Assigner.DEFAULT.assign(parameterDescription.getType(), ((TypeDescription) this.specializedLambdaMethod.getParameterTypes().get(parameterDescription.getIndex())).asGenericType(), Assigner.Typing.DYNAMIC));
                        }
                        StackManipulation[] stackManipulationArr = new StackManipulation[6];
                        stackManipulationArr[0] = compound;
                        stackManipulationArr[1] = new StackManipulation.Compound(arrayList);
                        stackManipulationArr[2] = new StackManipulation.Compound(arrayList2);
                        stackManipulationArr[3] = MethodInvocation.invoke(this.targetMethod);
                        Assigner assigner = Assigner.DEFAULT;
                        if (this.targetMethod.isConstructor()) {
                            returnType = this.targetMethod.getDeclaringType().asGenericType();
                        } else {
                            returnType = this.targetMethod.getReturnType();
                        }
                        stackManipulationArr[4] = assigner.assign(returnType, this.specializedLambdaMethod.getReturnType().asGenericType(), Assigner.Typing.DYNAMIC);
                        stackManipulationArr[5] = MethodReturn.of(this.specializedLambdaMethod.getReturnType());
                        return new ByteCodeAppender.Size(new StackManipulation.Compound(stackManipulationArr).apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static class SerializationImplementation implements Implementation {
                private final JavaConstant.MethodType lambdaMethod;
                private final String lambdaMethodName;
                private final TypeDescription lambdaType;
                private final JavaConstant.MethodType specializedMethod;
                private final JavaConstant.MethodHandle targetMethod;
                private final TypeDescription targetType;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    SerializationImplementation serializationImplementation = (SerializationImplementation) obj;
                    return this.targetType.equals(serializationImplementation.targetType) && this.lambdaType.equals(serializationImplementation.lambdaType) && this.lambdaMethodName.equals(serializationImplementation.lambdaMethodName) && this.lambdaMethod.equals(serializationImplementation.lambdaMethod) && this.targetMethod.equals(serializationImplementation.targetMethod) && this.specializedMethod.equals(serializationImplementation.specializedMethod);
                }

                public int hashCode() {
                    return ((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.targetType.hashCode()) * 31) + this.lambdaType.hashCode()) * 31) + this.lambdaMethodName.hashCode()) * 31) + this.lambdaMethod.hashCode()) * 31) + this.targetMethod.hashCode()) * 31) + this.specializedMethod.hashCode();
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                protected SerializationImplementation(TypeDescription typeDescription, TypeDescription typeDescription2, String str, JavaConstant.MethodType methodType, JavaConstant.MethodHandle methodHandle, JavaConstant.MethodType methodType2) {
                    this.targetType = typeDescription;
                    this.lambdaType = typeDescription2;
                    this.lambdaMethodName = str;
                    this.lambdaMethod = methodType;
                    this.targetMethod = methodHandle;
                    this.specializedMethod = methodType2;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation
                public ByteCodeAppender appender(Implementation.Target target) {
                    try {
                        TypeDescription of = TypeDescription.ForLoadedType.of(Class.forName("java.lang.invoke.SerializedLambda"));
                        ArrayList arrayList = new ArrayList(target.getInstrumentedType().getDeclaredFields().size());
                        for (FieldDescription.InDefinedShape inDefinedShape : target.getInstrumentedType().getDeclaredFields()) {
                            arrayList.add(new StackManipulation.Compound(MethodVariableAccess.loadThis(), FieldAccess.forField(inDefinedShape).read(), Assigner.DEFAULT.assign(inDefinedShape.getType(), TypeDescription.Generic.OBJECT, Assigner.Typing.STATIC)));
                        }
                        return new ByteCodeAppender.Simple(new StackManipulation.Compound(TypeCreation.of(of), Duplication.SINGLE, ClassConstant.of(this.targetType), new TextConstant(this.lambdaType.getInternalName()), new TextConstant(this.lambdaMethodName), new TextConstant(this.lambdaMethod.getDescriptor()), IntegerConstant.forValue(this.targetMethod.getHandleType().getIdentifier()), new TextConstant(this.targetMethod.getOwnerType().getInternalName()), new TextConstant(this.targetMethod.getName()), new TextConstant(this.targetMethod.getDescriptor()), new TextConstant(this.specializedMethod.getDescriptor()), ArrayFactory.forType(TypeDescription.Generic.OBJECT).withValues(arrayList), MethodInvocation.invoke((MethodDescription.InDefinedShape) of.getDeclaredMethods().filter(ElementMatchers.isConstructor()).getOnly()), MethodReturn.REFERENCE));
                    } catch (ClassNotFoundException e) {
                        throw new IllegalStateException("Cannot find class for lambda serialization", e);
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static class BridgeMethodImplementation implements Implementation {
                private final JavaConstant.MethodType lambdaMethod;
                private final String lambdaMethodName;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    BridgeMethodImplementation bridgeMethodImplementation = (BridgeMethodImplementation) obj;
                    return this.lambdaMethodName.equals(bridgeMethodImplementation.lambdaMethodName) && this.lambdaMethod.equals(bridgeMethodImplementation.lambdaMethod);
                }

                public int hashCode() {
                    return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.lambdaMethodName.hashCode()) * 31) + this.lambdaMethod.hashCode();
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                protected BridgeMethodImplementation(String str, JavaConstant.MethodType methodType) {
                    this.lambdaMethodName = str;
                    this.lambdaMethod = methodType;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation
                public ByteCodeAppender appender(Implementation.Target target) {
                    return new Appender(target.invokeSuper(new MethodDescription.SignatureToken(this.lambdaMethodName, this.lambdaMethod.getReturnType(), this.lambdaMethod.getParameterTypes())));
                }

                @HashCodeAndEqualsPlugin.Enhance
                protected static class Appender implements ByteCodeAppender {
                    private final Implementation.SpecialMethodInvocation bridgeTargetInvocation;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.bridgeTargetInvocation.equals(((Appender) obj).bridgeTargetInvocation);
                    }

                    public int hashCode() {
                        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.bridgeTargetInvocation.hashCode();
                    }

                    protected Appender(Implementation.SpecialMethodInvocation specialMethodInvocation) {
                        this.bridgeTargetInvocation = specialMethodInvocation;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender
                    public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
                        ByteCodeAppender[] byteCodeAppenderArr = new ByteCodeAppender[1];
                        StackManipulation[] stackManipulationArr = new StackManipulation[4];
                        stackManipulationArr[0] = MethodVariableAccess.allArgumentsOf(methodDescription).asBridgeOf(this.bridgeTargetInvocation.getMethodDescription()).prependThisReference();
                        Implementation.SpecialMethodInvocation specialMethodInvocation = this.bridgeTargetInvocation;
                        stackManipulationArr[1] = specialMethodInvocation;
                        stackManipulationArr[2] = specialMethodInvocation.getMethodDescription().getReturnType().asErasure().isAssignableTo(methodDescription.getReturnType().asErasure()) ? StackManipulation.Trivial.INSTANCE : TypeCasting.to(methodDescription.getReceiverType());
                        stackManipulationArr[3] = MethodReturn.of(methodDescription.getReturnType());
                        byteCodeAppenderArr[0] = new ByteCodeAppender.Simple(stackManipulationArr);
                        return new ByteCodeAppender.Compound(byteCodeAppenderArr).apply(methodVisitor, context, methodDescription);
                    }
                }
            }
        }

        protected enum MetaFactoryRedirection implements AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper
            public MethodVisitor wrap(TypeDescription typeDescription, MethodDescription methodDescription, MethodVisitor methodVisitor, Implementation.Context context, TypePool typePool, int i, int i2) {
                methodVisitor.visitCode();
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, LambdaInstrumentationStrategy.UNSAFE_CLASS, "getUnsafe", "()L" + LambdaInstrumentationStrategy.UNSAFE_CLASS + ";", false);
                methodVisitor.visitVarInsn(58, 6);
                methodVisitor.visitVarInsn(25, 6);
                methodVisitor.visitVarInsn(25, 0);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/invoke/MethodHandles$Lookup", "lookupClass", "()Ljava/lang/Class;", false);
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/ClassLoader", "getSystemClassLoader", "()Ljava/lang/ClassLoader;", false);
                methodVisitor.visitLdcInsn("org.modelmapper.internal.bytebuddy.agent.builder.LambdaFactory");
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/ClassLoader", "loadClass", "(Ljava/lang/String;)Ljava/lang/Class;", false);
                methodVisitor.visitLdcInsn("make");
                methodVisitor.visitIntInsn(16, 9);
                methodVisitor.visitTypeInsn(189, TypeProxy.SilentConstruction.Appender.JAVA_LANG_CLASS_INTERNAL_NAME);
                methodVisitor.visitInsn(89);
                methodVisitor.visitInsn(3);
                methodVisitor.visitLdcInsn(org.modelmapper.internal.asm.Type.getType(TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR));
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitInsn(4);
                methodVisitor.visitLdcInsn(org.modelmapper.internal.asm.Type.getType("Ljava/lang/String;"));
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitInsn(5);
                methodVisitor.visitLdcInsn(org.modelmapper.internal.asm.Type.getType(TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR));
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitInsn(6);
                methodVisitor.visitLdcInsn(org.modelmapper.internal.asm.Type.getType(TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR));
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitInsn(7);
                methodVisitor.visitLdcInsn(org.modelmapper.internal.asm.Type.getType(TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR));
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitInsn(8);
                methodVisitor.visitLdcInsn(org.modelmapper.internal.asm.Type.getType(TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR));
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitIntInsn(16, 6);
                methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/Boolean", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/Class;");
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitIntInsn(16, 7);
                methodVisitor.visitLdcInsn(org.modelmapper.internal.asm.Type.getType("Ljava/util/List;"));
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitIntInsn(16, 8);
                methodVisitor.visitLdcInsn(org.modelmapper.internal.asm.Type.getType("Ljava/util/List;"));
                methodVisitor.visitInsn(83);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, TypeProxy.SilentConstruction.Appender.JAVA_LANG_CLASS_INTERNAL_NAME, "getDeclaredMethod", "(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", false);
                methodVisitor.visitInsn(1);
                methodVisitor.visitIntInsn(16, 9);
                methodVisitor.visitTypeInsn(189, TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME);
                methodVisitor.visitInsn(89);
                methodVisitor.visitInsn(3);
                methodVisitor.visitVarInsn(25, 0);
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitInsn(4);
                methodVisitor.visitVarInsn(25, 1);
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitInsn(5);
                methodVisitor.visitVarInsn(25, 2);
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitInsn(6);
                methodVisitor.visitVarInsn(25, 3);
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitInsn(7);
                methodVisitor.visitVarInsn(25, 4);
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitInsn(8);
                methodVisitor.visitVarInsn(25, 5);
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitIntInsn(16, 6);
                methodVisitor.visitInsn(3);
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitIntInsn(16, 7);
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Collections", "emptyList", "()Ljava/util/List;", false);
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitIntInsn(16, 8);
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Collections", "emptyList", "()Ljava/util/List;", false);
                methodVisitor.visitInsn(83);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/reflect/Method", "invoke", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
                methodVisitor.visitTypeInsn(192, "[B");
                methodVisitor.visitInsn(1);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, LambdaInstrumentationStrategy.UNSAFE_CLASS, "defineAnonymousClass", "(Ljava/lang/Class;[B[Ljava/lang/Object;)Ljava/lang/Class;", false);
                methodVisitor.visitVarInsn(58, 7);
                methodVisitor.visitVarInsn(25, 6);
                methodVisitor.visitVarInsn(25, 7);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, LambdaInstrumentationStrategy.UNSAFE_CLASS, "ensureClassInitialized", "(Ljava/lang/Class;)V", false);
                methodVisitor.visitVarInsn(25, 2);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/invoke/MethodType", "parameterCount", "()I", false);
                Label label = new Label();
                methodVisitor.visitJumpInsn(154, label);
                methodVisitor.visitTypeInsn(Opcodes.NEW, "java/lang/invoke/ConstantCallSite");
                methodVisitor.visitInsn(89);
                methodVisitor.visitVarInsn(25, 2);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/invoke/MethodType", "returnType", "()Ljava/lang/Class;", false);
                methodVisitor.visitVarInsn(25, 7);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, TypeProxy.SilentConstruction.Appender.JAVA_LANG_CLASS_INTERNAL_NAME, "getDeclaredConstructors", "()[Ljava/lang/reflect/Constructor;", false);
                methodVisitor.visitInsn(3);
                methodVisitor.visitInsn(50);
                methodVisitor.visitInsn(3);
                methodVisitor.visitTypeInsn(189, TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, TypeProxy.SilentConstruction.Appender.JAVA_LANG_CONSTRUCTOR_INTERNAL_NAME, TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_DESCRIPTOR, false);
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/invoke/MethodHandles", RRWebVideoEvent.REPLAY_FRAME_RATE_TYPE_CONSTANT, "(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;", false);
                methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/invoke/ConstantCallSite", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/invoke/MethodHandle;)V", false);
                Label label2 = new Label();
                methodVisitor.visitJumpInsn(Opcodes.GOTO, label2);
                methodVisitor.visitLabel(label);
                methodVisitor.visitFrame(1, 2, new Object[]{LambdaInstrumentationStrategy.UNSAFE_CLASS, TypeProxy.SilentConstruction.Appender.JAVA_LANG_CLASS_INTERNAL_NAME}, 0, null);
                methodVisitor.visitTypeInsn(Opcodes.NEW, "java/lang/invoke/ConstantCallSite");
                methodVisitor.visitInsn(89);
                methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/invoke/MethodHandles$Lookup", "IMPL_LOOKUP", "Ljava/lang/invoke/MethodHandles$Lookup;");
                methodVisitor.visitVarInsn(25, 7);
                methodVisitor.visitLdcInsn("get$Lambda");
                methodVisitor.visitVarInsn(25, 2);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/invoke/MethodHandles$Lookup", "findStatic", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;", false);
                methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/invoke/ConstantCallSite", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/invoke/MethodHandle;)V", false);
                methodVisitor.visitLabel(label2);
                methodVisitor.visitFrame(4, 0, null, 1, new Object[]{"java/lang/invoke/CallSite"});
                methodVisitor.visitInsn(Opcodes.ARETURN);
                methodVisitor.visitMaxs(8, 8);
                methodVisitor.visitEnd();
                return LambdaInstrumentationStrategy.IGNORE_ORIGINAL;
            }
        }

        protected enum AlternativeMetaFactoryRedirection implements AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper
            public MethodVisitor wrap(TypeDescription typeDescription, MethodDescription methodDescription, MethodVisitor methodVisitor, Implementation.Context context, TypePool typePool, int i, int i2) {
                methodVisitor.visitCode();
                methodVisitor.visitVarInsn(25, 3);
                methodVisitor.visitInsn(6);
                methodVisitor.visitInsn(50);
                methodVisitor.visitTypeInsn(192, "java/lang/Integer");
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
                methodVisitor.visitVarInsn(54, 4);
                methodVisitor.visitInsn(7);
                methodVisitor.visitVarInsn(54, 5);
                methodVisitor.visitVarInsn(21, 4);
                methodVisitor.visitInsn(5);
                methodVisitor.visitInsn(126);
                Label label = new Label();
                methodVisitor.visitJumpInsn(153, label);
                methodVisitor.visitVarInsn(25, 3);
                methodVisitor.visitVarInsn(21, 5);
                methodVisitor.visitIincInsn(5, 1);
                methodVisitor.visitInsn(50);
                methodVisitor.visitTypeInsn(192, "java/lang/Integer");
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
                methodVisitor.visitVarInsn(54, 7);
                methodVisitor.visitVarInsn(21, 7);
                methodVisitor.visitTypeInsn(189, TypeProxy.SilentConstruction.Appender.JAVA_LANG_CLASS_INTERNAL_NAME);
                methodVisitor.visitVarInsn(58, 6);
                methodVisitor.visitVarInsn(25, 3);
                methodVisitor.visitVarInsn(21, 5);
                methodVisitor.visitVarInsn(25, 6);
                methodVisitor.visitInsn(3);
                methodVisitor.visitVarInsn(21, 7);
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
                methodVisitor.visitVarInsn(21, 5);
                methodVisitor.visitVarInsn(21, 7);
                methodVisitor.visitInsn(96);
                methodVisitor.visitVarInsn(54, 5);
                Label label2 = new Label();
                methodVisitor.visitJumpInsn(Opcodes.GOTO, label2);
                methodVisitor.visitLabel(label);
                methodVisitor.visitFrame(1, 2, new Object[]{Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
                methodVisitor.visitInsn(3);
                methodVisitor.visitTypeInsn(189, TypeProxy.SilentConstruction.Appender.JAVA_LANG_CLASS_INTERNAL_NAME);
                methodVisitor.visitVarInsn(58, 6);
                methodVisitor.visitLabel(label2);
                methodVisitor.visitFrame(1, 1, new Object[]{"[Ljava/lang/Class;"}, 0, null);
                methodVisitor.visitVarInsn(21, 4);
                methodVisitor.visitInsn(7);
                methodVisitor.visitInsn(126);
                Label label3 = new Label();
                methodVisitor.visitJumpInsn(153, label3);
                methodVisitor.visitVarInsn(25, 3);
                methodVisitor.visitVarInsn(21, 5);
                methodVisitor.visitIincInsn(5, 1);
                methodVisitor.visitInsn(50);
                methodVisitor.visitTypeInsn(192, "java/lang/Integer");
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
                methodVisitor.visitVarInsn(54, 8);
                methodVisitor.visitVarInsn(21, 8);
                methodVisitor.visitTypeInsn(189, "java/lang/invoke/MethodType");
                methodVisitor.visitVarInsn(58, 7);
                methodVisitor.visitVarInsn(25, 3);
                methodVisitor.visitVarInsn(21, 5);
                methodVisitor.visitVarInsn(25, 7);
                methodVisitor.visitInsn(3);
                methodVisitor.visitVarInsn(21, 8);
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
                Label label4 = new Label();
                methodVisitor.visitJumpInsn(Opcodes.GOTO, label4);
                methodVisitor.visitLabel(label3);
                methodVisitor.visitFrame(3, 0, null, 0, null);
                methodVisitor.visitInsn(3);
                methodVisitor.visitTypeInsn(189, "java/lang/invoke/MethodType");
                methodVisitor.visitVarInsn(58, 7);
                methodVisitor.visitLabel(label4);
                methodVisitor.visitFrame(1, 1, new Object[]{"[Ljava/lang/invoke/MethodType;"}, 0, null);
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, LambdaInstrumentationStrategy.UNSAFE_CLASS, "getUnsafe", "()L" + LambdaInstrumentationStrategy.UNSAFE_CLASS + ";", false);
                methodVisitor.visitVarInsn(58, 8);
                methodVisitor.visitVarInsn(25, 8);
                methodVisitor.visitVarInsn(25, 0);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/invoke/MethodHandles$Lookup", "lookupClass", "()Ljava/lang/Class;", false);
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/ClassLoader", "getSystemClassLoader", "()Ljava/lang/ClassLoader;", false);
                methodVisitor.visitLdcInsn("org.modelmapper.internal.bytebuddy.agent.builder.LambdaFactory");
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/ClassLoader", "loadClass", "(Ljava/lang/String;)Ljava/lang/Class;", false);
                methodVisitor.visitLdcInsn("make");
                methodVisitor.visitIntInsn(16, 9);
                methodVisitor.visitTypeInsn(189, TypeProxy.SilentConstruction.Appender.JAVA_LANG_CLASS_INTERNAL_NAME);
                methodVisitor.visitInsn(89);
                methodVisitor.visitInsn(3);
                methodVisitor.visitLdcInsn(org.modelmapper.internal.asm.Type.getType(TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR));
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitInsn(4);
                methodVisitor.visitLdcInsn(org.modelmapper.internal.asm.Type.getType("Ljava/lang/String;"));
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitInsn(5);
                methodVisitor.visitLdcInsn(org.modelmapper.internal.asm.Type.getType(TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR));
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitInsn(6);
                methodVisitor.visitLdcInsn(org.modelmapper.internal.asm.Type.getType(TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR));
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitInsn(7);
                methodVisitor.visitLdcInsn(org.modelmapper.internal.asm.Type.getType(TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR));
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitInsn(8);
                methodVisitor.visitLdcInsn(org.modelmapper.internal.asm.Type.getType(TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR));
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitIntInsn(16, 6);
                methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/Boolean", CredentialProviderBaseController.TYPE_TAG, "Ljava/lang/Class;");
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitIntInsn(16, 7);
                methodVisitor.visitLdcInsn(org.modelmapper.internal.asm.Type.getType("Ljava/util/List;"));
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitIntInsn(16, 8);
                methodVisitor.visitLdcInsn(org.modelmapper.internal.asm.Type.getType("Ljava/util/List;"));
                methodVisitor.visitInsn(83);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, TypeProxy.SilentConstruction.Appender.JAVA_LANG_CLASS_INTERNAL_NAME, "getDeclaredMethod", "(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", false);
                methodVisitor.visitInsn(1);
                methodVisitor.visitIntInsn(16, 9);
                methodVisitor.visitTypeInsn(189, TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME);
                methodVisitor.visitInsn(89);
                methodVisitor.visitInsn(3);
                methodVisitor.visitVarInsn(25, 0);
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitInsn(4);
                methodVisitor.visitVarInsn(25, 1);
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitInsn(5);
                methodVisitor.visitVarInsn(25, 2);
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitInsn(6);
                methodVisitor.visitVarInsn(25, 3);
                methodVisitor.visitInsn(3);
                methodVisitor.visitInsn(50);
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitInsn(7);
                methodVisitor.visitVarInsn(25, 3);
                methodVisitor.visitInsn(4);
                methodVisitor.visitInsn(50);
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitInsn(8);
                methodVisitor.visitVarInsn(25, 3);
                methodVisitor.visitInsn(5);
                methodVisitor.visitInsn(50);
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitIntInsn(16, 6);
                methodVisitor.visitVarInsn(21, 4);
                methodVisitor.visitInsn(4);
                methodVisitor.visitInsn(126);
                Label label5 = new Label();
                methodVisitor.visitJumpInsn(153, label5);
                methodVisitor.visitInsn(4);
                Label label6 = new Label();
                methodVisitor.visitJumpInsn(Opcodes.GOTO, label6);
                methodVisitor.visitLabel(label5);
                methodVisitor.visitFrame(0, 9, new Object[]{"java/lang/invoke/MethodHandles$Lookup", "java/lang/String", "java/lang/invoke/MethodType", "[Ljava/lang/Object;", Opcodes.INTEGER, Opcodes.INTEGER, "[Ljava/lang/Class;", "[Ljava/lang/invoke/MethodType;", LambdaInstrumentationStrategy.UNSAFE_CLASS}, 7, new Object[]{LambdaInstrumentationStrategy.UNSAFE_CLASS, TypeProxy.SilentConstruction.Appender.JAVA_LANG_CLASS_INTERNAL_NAME, "java/lang/reflect/Method", Opcodes.NULL, "[Ljava/lang/Object;", "[Ljava/lang/Object;", Opcodes.INTEGER});
                methodVisitor.visitInsn(3);
                methodVisitor.visitLabel(label6);
                methodVisitor.visitFrame(0, 9, new Object[]{"java/lang/invoke/MethodHandles$Lookup", "java/lang/String", "java/lang/invoke/MethodType", "[Ljava/lang/Object;", Opcodes.INTEGER, Opcodes.INTEGER, "[Ljava/lang/Class;", "[Ljava/lang/invoke/MethodType;", LambdaInstrumentationStrategy.UNSAFE_CLASS}, 8, new Object[]{LambdaInstrumentationStrategy.UNSAFE_CLASS, TypeProxy.SilentConstruction.Appender.JAVA_LANG_CLASS_INTERNAL_NAME, "java/lang/reflect/Method", Opcodes.NULL, "[Ljava/lang/Object;", "[Ljava/lang/Object;", Opcodes.INTEGER, Opcodes.INTEGER});
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitIntInsn(16, 7);
                methodVisitor.visitVarInsn(25, 6);
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
                methodVisitor.visitInsn(83);
                methodVisitor.visitInsn(89);
                methodVisitor.visitIntInsn(16, 8);
                methodVisitor.visitVarInsn(25, 7);
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
                methodVisitor.visitInsn(83);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/reflect/Method", "invoke", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
                methodVisitor.visitTypeInsn(192, "[B");
                methodVisitor.visitInsn(1);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, LambdaInstrumentationStrategy.UNSAFE_CLASS, "defineAnonymousClass", "(Ljava/lang/Class;[B[Ljava/lang/Object;)Ljava/lang/Class;", false);
                methodVisitor.visitVarInsn(58, 9);
                methodVisitor.visitVarInsn(25, 8);
                methodVisitor.visitVarInsn(25, 9);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, LambdaInstrumentationStrategy.UNSAFE_CLASS, "ensureClassInitialized", "(Ljava/lang/Class;)V", false);
                methodVisitor.visitVarInsn(25, 2);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/invoke/MethodType", "parameterCount", "()I", false);
                Label label7 = new Label();
                methodVisitor.visitJumpInsn(154, label7);
                methodVisitor.visitTypeInsn(Opcodes.NEW, "java/lang/invoke/ConstantCallSite");
                methodVisitor.visitInsn(89);
                methodVisitor.visitVarInsn(25, 2);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/invoke/MethodType", "returnType", "()Ljava/lang/Class;", false);
                methodVisitor.visitVarInsn(25, 9);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, TypeProxy.SilentConstruction.Appender.JAVA_LANG_CLASS_INTERNAL_NAME, "getDeclaredConstructors", "()[Ljava/lang/reflect/Constructor;", false);
                methodVisitor.visitInsn(3);
                methodVisitor.visitInsn(50);
                methodVisitor.visitInsn(3);
                methodVisitor.visitTypeInsn(189, TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, TypeProxy.SilentConstruction.Appender.JAVA_LANG_CONSTRUCTOR_INTERNAL_NAME, TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_NAME, TypeProxy.SilentConstruction.Appender.NEW_INSTANCE_METHOD_DESCRIPTOR, false);
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/invoke/MethodHandles", RRWebVideoEvent.REPLAY_FRAME_RATE_TYPE_CONSTANT, "(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;", false);
                methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/invoke/ConstantCallSite", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/invoke/MethodHandle;)V", false);
                Label label8 = new Label();
                methodVisitor.visitJumpInsn(Opcodes.GOTO, label8);
                methodVisitor.visitLabel(label7);
                methodVisitor.visitFrame(1, 1, new Object[]{TypeProxy.SilentConstruction.Appender.JAVA_LANG_CLASS_INTERNAL_NAME}, 0, null);
                methodVisitor.visitTypeInsn(Opcodes.NEW, "java/lang/invoke/ConstantCallSite");
                methodVisitor.visitInsn(89);
                methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/invoke/MethodHandles$Lookup", "IMPL_LOOKUP", "Ljava/lang/invoke/MethodHandles$Lookup;");
                methodVisitor.visitVarInsn(25, 9);
                methodVisitor.visitLdcInsn("get$Lambda");
                methodVisitor.visitVarInsn(25, 2);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/invoke/MethodHandles$Lookup", "findStatic", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;", false);
                methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/invoke/ConstantCallSite", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/invoke/MethodHandle;)V", false);
                methodVisitor.visitLabel(label8);
                methodVisitor.visitFrame(4, 0, null, 1, new Object[]{"java/lang/invoke/CallSite"});
                methodVisitor.visitInsn(Opcodes.ARETURN);
                methodVisitor.visitMaxs(9, 10);
                methodVisitor.visitEnd();
                return LambdaInstrumentationStrategy.IGNORE_ORIGINAL;
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Default implements AgentBuilder {
        private static final CircularityLock DEFAULT_LOCK = new CircularityLock.Default();
        private static final String INSTALLER_TYPE = "org.modelmapper.internal.bytebuddy.agent.Installer";
        private static final String INSTRUMENTATION_GETTER = "getInstrumentation";
        private static final Class<?> NO_LOADED_TYPE = null;
        private static final byte[] NO_TRANSFORMATION = null;
        private static final Object STATIC_MEMBER = null;
        protected final BootstrapInjectionStrategy bootstrapInjectionStrategy;
        protected final ByteBuddy byteBuddy;
        protected final CircularityLock circularityLock;
        protected final ClassFileBufferStrategy classFileBufferStrategy;
        protected final DescriptionStrategy descriptionStrategy;
        protected final FallbackStrategy fallbackStrategy;
        protected final RawMatcher ignoredTypeMatcher;
        protected final InitializationStrategy initializationStrategy;
        protected final InstallationListener installationListener;
        protected final LambdaInstrumentationStrategy lambdaInstrumentationStrategy;
        protected final Listener listener;
        protected final LocationStrategy locationStrategy;
        protected final NativeMethodStrategy nativeMethodStrategy;
        protected final PoolStrategy poolStrategy;
        protected final RedefinitionStrategy.BatchAllocator redefinitionBatchAllocator;
        protected final RedefinitionStrategy.DiscoveryStrategy redefinitionDiscoveryStrategy;
        protected final RedefinitionStrategy.Listener redefinitionListener;
        protected final RedefinitionStrategy.ResubmissionStrategy redefinitionResubmissionStrategy;
        protected final RedefinitionStrategy redefinitionStrategy;
        protected final Transformation transformation;
        protected final TypeStrategy typeStrategy;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Default r5 = (Default) obj;
            return this.byteBuddy.equals(r5.byteBuddy) && this.listener.equals(r5.listener) && this.circularityLock.equals(r5.circularityLock) && this.poolStrategy.equals(r5.poolStrategy) && this.typeStrategy.equals(r5.typeStrategy) && this.locationStrategy.equals(r5.locationStrategy) && this.nativeMethodStrategy.equals(r5.nativeMethodStrategy) && this.initializationStrategy.equals(r5.initializationStrategy) && this.redefinitionStrategy.equals(r5.redefinitionStrategy) && this.redefinitionDiscoveryStrategy.equals(r5.redefinitionDiscoveryStrategy) && this.redefinitionBatchAllocator.equals(r5.redefinitionBatchAllocator) && this.redefinitionListener.equals(r5.redefinitionListener) && this.redefinitionResubmissionStrategy.equals(r5.redefinitionResubmissionStrategy) && this.bootstrapInjectionStrategy.equals(r5.bootstrapInjectionStrategy) && this.lambdaInstrumentationStrategy.equals(r5.lambdaInstrumentationStrategy) && this.descriptionStrategy.equals(r5.descriptionStrategy) && this.fallbackStrategy.equals(r5.fallbackStrategy) && this.classFileBufferStrategy.equals(r5.classFileBufferStrategy) && this.installationListener.equals(r5.installationListener) && this.ignoredTypeMatcher.equals(r5.ignoredTypeMatcher) && this.transformation.equals(r5.transformation);
        }

        public int hashCode() {
            return ((((((((((((((((((((((((((((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.byteBuddy.hashCode()) * 31) + this.listener.hashCode()) * 31) + this.circularityLock.hashCode()) * 31) + this.poolStrategy.hashCode()) * 31) + this.typeStrategy.hashCode()) * 31) + this.locationStrategy.hashCode()) * 31) + this.nativeMethodStrategy.hashCode()) * 31) + this.initializationStrategy.hashCode()) * 31) + this.redefinitionStrategy.hashCode()) * 31) + this.redefinitionDiscoveryStrategy.hashCode()) * 31) + this.redefinitionBatchAllocator.hashCode()) * 31) + this.redefinitionListener.hashCode()) * 31) + this.redefinitionResubmissionStrategy.hashCode()) * 31) + this.bootstrapInjectionStrategy.hashCode()) * 31) + this.lambdaInstrumentationStrategy.hashCode()) * 31) + this.descriptionStrategy.hashCode()) * 31) + this.fallbackStrategy.hashCode()) * 31) + this.classFileBufferStrategy.hashCode()) * 31) + this.installationListener.hashCode()) * 31) + this.ignoredTypeMatcher.hashCode()) * 31) + this.transformation.hashCode();
        }

        public Default() {
            this(new ByteBuddy());
        }

        public Default(ByteBuddy byteBuddy) {
            this(byteBuddy, Listener.NoOp.INSTANCE, DEFAULT_LOCK, PoolStrategy.Default.FAST, TypeStrategy.Default.REBASE, LocationStrategy.ForClassLoader.STRONG, NativeMethodStrategy.Disabled.INSTANCE, new InitializationStrategy.SelfInjection.Split(), RedefinitionStrategy.DISABLED, RedefinitionStrategy.DiscoveryStrategy.SinglePass.INSTANCE, RedefinitionStrategy.BatchAllocator.ForTotal.INSTANCE, RedefinitionStrategy.Listener.NoOp.INSTANCE, RedefinitionStrategy.ResubmissionStrategy.Disabled.INSTANCE, BootstrapInjectionStrategy.Disabled.INSTANCE, LambdaInstrumentationStrategy.DISABLED, DescriptionStrategy.Default.HYBRID, FallbackStrategy.ByThrowableType.ofOptionalTypes(), ClassFileBufferStrategy.Default.RETAINING, InstallationListener.NoOp.INSTANCE, new RawMatcher.Disjunction(new RawMatcher.ForElementMatchers(ElementMatchers.any(), ElementMatchers.isBootstrapClassLoader()), new RawMatcher.ForElementMatchers(ElementMatchers.nameStartsWith("org.modelmapper.internal.bytebuddy.").or(ElementMatchers.nameStartsWith("sun.reflect.")).or(ElementMatchers.isSynthetic()))), Transformation.Ignored.INSTANCE);
        }

        protected Default(ByteBuddy byteBuddy, Listener listener, CircularityLock circularityLock, PoolStrategy poolStrategy, TypeStrategy typeStrategy, LocationStrategy locationStrategy, NativeMethodStrategy nativeMethodStrategy, InitializationStrategy initializationStrategy, RedefinitionStrategy redefinitionStrategy, RedefinitionStrategy.DiscoveryStrategy discoveryStrategy, RedefinitionStrategy.BatchAllocator batchAllocator, RedefinitionStrategy.Listener listener2, RedefinitionStrategy.ResubmissionStrategy resubmissionStrategy, BootstrapInjectionStrategy bootstrapInjectionStrategy, LambdaInstrumentationStrategy lambdaInstrumentationStrategy, DescriptionStrategy descriptionStrategy, FallbackStrategy fallbackStrategy, ClassFileBufferStrategy classFileBufferStrategy, InstallationListener installationListener, RawMatcher rawMatcher, Transformation transformation) {
            this.byteBuddy = byteBuddy;
            this.listener = listener;
            this.circularityLock = circularityLock;
            this.poolStrategy = poolStrategy;
            this.typeStrategy = typeStrategy;
            this.locationStrategy = locationStrategy;
            this.nativeMethodStrategy = nativeMethodStrategy;
            this.initializationStrategy = initializationStrategy;
            this.redefinitionStrategy = redefinitionStrategy;
            this.redefinitionDiscoveryStrategy = discoveryStrategy;
            this.redefinitionBatchAllocator = batchAllocator;
            this.redefinitionListener = listener2;
            this.redefinitionResubmissionStrategy = resubmissionStrategy;
            this.bootstrapInjectionStrategy = bootstrapInjectionStrategy;
            this.lambdaInstrumentationStrategy = lambdaInstrumentationStrategy;
            this.descriptionStrategy = descriptionStrategy;
            this.fallbackStrategy = fallbackStrategy;
            this.classFileBufferStrategy = classFileBufferStrategy;
            this.installationListener = installationListener;
            this.ignoredTypeMatcher = rawMatcher;
            this.transformation = transformation;
        }

        public static AgentBuilder of(Plugin... pluginArr) {
            return of((List<? extends Plugin>) Arrays.asList(pluginArr));
        }

        public static AgentBuilder of(List<? extends Plugin> list) {
            return of(EntryPoint.Default.REBASE, list);
        }

        public static AgentBuilder of(EntryPoint entryPoint, Plugin... pluginArr) {
            return of(entryPoint, (List<? extends Plugin>) Arrays.asList(pluginArr));
        }

        public static AgentBuilder of(EntryPoint entryPoint, List<? extends Plugin> list) {
            return of(entryPoint, ClassFileVersion.ofThisVm(), list);
        }

        public static AgentBuilder of(ClassFileVersion classFileVersion, Plugin... pluginArr) {
            return of(classFileVersion, (List<? extends Plugin>) Arrays.asList(pluginArr));
        }

        public static AgentBuilder of(ClassFileVersion classFileVersion, List<? extends Plugin> list) {
            return of(EntryPoint.Default.REBASE, classFileVersion, list);
        }

        public static AgentBuilder of(EntryPoint entryPoint, ClassFileVersion classFileVersion, Plugin... pluginArr) {
            return of(entryPoint, classFileVersion, (List<? extends Plugin>) Arrays.asList(pluginArr));
        }

        public static AgentBuilder of(EntryPoint entryPoint, ClassFileVersion classFileVersion, List<? extends Plugin> list) {
            AgentBuilder with = new Default(entryPoint.byteBuddy(classFileVersion)).with(new TypeStrategy.ForBuildEntryPoint(entryPoint));
            for (Plugin plugin : list) {
                with = with.type(plugin).transform(new Transformer.ForBuildPlugin(plugin));
            }
            return with;
        }

        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder with(ByteBuddy byteBuddy) {
            return new Default(byteBuddy, this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.nativeMethodStrategy, this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.bootstrapInjectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoredTypeMatcher, this.transformation);
        }

        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder with(Listener listener) {
            return new Default(this.byteBuddy, new Listener.Compound(this.listener, listener), this.circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.nativeMethodStrategy, this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.bootstrapInjectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoredTypeMatcher, this.transformation);
        }

        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder with(CircularityLock circularityLock) {
            return new Default(this.byteBuddy, this.listener, circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.nativeMethodStrategy, this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.bootstrapInjectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoredTypeMatcher, this.transformation);
        }

        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder with(TypeStrategy typeStrategy) {
            return new Default(this.byteBuddy, this.listener, this.circularityLock, this.poolStrategy, typeStrategy, this.locationStrategy, this.nativeMethodStrategy, this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.bootstrapInjectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoredTypeMatcher, this.transformation);
        }

        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder with(PoolStrategy poolStrategy) {
            return new Default(this.byteBuddy, this.listener, this.circularityLock, poolStrategy, this.typeStrategy, this.locationStrategy, this.nativeMethodStrategy, this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.bootstrapInjectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoredTypeMatcher, this.transformation);
        }

        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder with(LocationStrategy locationStrategy) {
            return new Default(this.byteBuddy, this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy, locationStrategy, this.nativeMethodStrategy, this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.bootstrapInjectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoredTypeMatcher, this.transformation);
        }

        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder enableNativeMethodPrefix(String str) {
            return new Default(this.byteBuddy, this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, NativeMethodStrategy.ForPrefix.of(str), this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.bootstrapInjectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoredTypeMatcher, this.transformation);
        }

        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder disableNativeMethodPrefix() {
            return new Default(this.byteBuddy, this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, NativeMethodStrategy.Disabled.INSTANCE, this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.bootstrapInjectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoredTypeMatcher, this.transformation);
        }

        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
        public RedefinitionListenable.WithoutBatchStrategy with(RedefinitionStrategy redefinitionStrategy) {
            return new Redefining(this.byteBuddy, this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.nativeMethodStrategy, this.initializationStrategy, redefinitionStrategy, RedefinitionStrategy.DiscoveryStrategy.SinglePass.INSTANCE, RedefinitionStrategy.BatchAllocator.ForTotal.INSTANCE, RedefinitionStrategy.Listener.NoOp.INSTANCE, RedefinitionStrategy.ResubmissionStrategy.Disabled.INSTANCE, this.bootstrapInjectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoredTypeMatcher, this.transformation);
        }

        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder with(InitializationStrategy initializationStrategy) {
            return new Default(this.byteBuddy, this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.nativeMethodStrategy, initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.bootstrapInjectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoredTypeMatcher, this.transformation);
        }

        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder with(LambdaInstrumentationStrategy lambdaInstrumentationStrategy) {
            return new Default(this.byteBuddy, this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.nativeMethodStrategy, this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.bootstrapInjectionStrategy, lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoredTypeMatcher, this.transformation);
        }

        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder with(DescriptionStrategy descriptionStrategy) {
            return new Default(this.byteBuddy, this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.nativeMethodStrategy, this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.bootstrapInjectionStrategy, this.lambdaInstrumentationStrategy, descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoredTypeMatcher, this.transformation);
        }

        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder with(FallbackStrategy fallbackStrategy) {
            return new Default(this.byteBuddy, this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.nativeMethodStrategy, this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.bootstrapInjectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoredTypeMatcher, this.transformation);
        }

        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder with(ClassFileBufferStrategy classFileBufferStrategy) {
            return new Default(this.byteBuddy, this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.nativeMethodStrategy, this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.bootstrapInjectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, classFileBufferStrategy, this.installationListener, this.ignoredTypeMatcher, this.transformation);
        }

        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder with(InstallationListener installationListener) {
            return new Default(this.byteBuddy, this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.nativeMethodStrategy, this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.bootstrapInjectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, new InstallationListener.Compound(this.installationListener, installationListener), this.ignoredTypeMatcher, this.transformation);
        }

        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder enableBootstrapInjection(Instrumentation instrumentation, File file) {
            return new Default(this.byteBuddy, this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.nativeMethodStrategy, this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, new BootstrapInjectionStrategy.Enabled(file, instrumentation), this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoredTypeMatcher, this.transformation);
        }

        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder enableUnsafeBootstrapInjection() {
            return new Default(this.byteBuddy, this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.nativeMethodStrategy, this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, BootstrapInjectionStrategy.Unsafe.INSTANCE, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoredTypeMatcher, this.transformation);
        }

        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder disableBootstrapInjection() {
            return new Default(this.byteBuddy, this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.nativeMethodStrategy, this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, BootstrapInjectionStrategy.Disabled.INSTANCE, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoredTypeMatcher, this.transformation);
        }

        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder disableClassFormatChanges() {
            return new Default(this.byteBuddy.with(Implementation.Context.Disabled.Factory.INSTANCE), this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy == TypeStrategy.Default.DECORATE ? TypeStrategy.Default.DECORATE : TypeStrategy.Default.REDEFINE_FROZEN, this.locationStrategy, NativeMethodStrategy.Disabled.INSTANCE, InitializationStrategy.NoOp.INSTANCE, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.bootstrapInjectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoredTypeMatcher, this.transformation);
        }

        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder assureReadEdgeTo(Instrumentation instrumentation, Class<?>... clsArr) {
            return JavaModule.isSupported() ? with(Listener.ModuleReadEdgeCompleting.of(instrumentation, false, clsArr)) : this;
        }

        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder assureReadEdgeTo(Instrumentation instrumentation, JavaModule... javaModuleArr) {
            return assureReadEdgeTo(instrumentation, Arrays.asList(javaModuleArr));
        }

        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder assureReadEdgeTo(Instrumentation instrumentation, Collection<? extends JavaModule> collection) {
            return with(new Listener.ModuleReadEdgeCompleting(instrumentation, false, new HashSet(collection)));
        }

        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder assureReadEdgeFromAndTo(Instrumentation instrumentation, Class<?>... clsArr) {
            return JavaModule.isSupported() ? with(Listener.ModuleReadEdgeCompleting.of(instrumentation, true, clsArr)) : this;
        }

        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder assureReadEdgeFromAndTo(Instrumentation instrumentation, JavaModule... javaModuleArr) {
            return assureReadEdgeFromAndTo(instrumentation, Arrays.asList(javaModuleArr));
        }

        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
        public AgentBuilder assureReadEdgeFromAndTo(Instrumentation instrumentation, Collection<? extends JavaModule> collection) {
            return with(new Listener.ModuleReadEdgeCompleting(instrumentation, true, new HashSet(collection)));
        }

        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
        public Identified.Narrowable type(RawMatcher rawMatcher) {
            return new Transforming(rawMatcher, Transformer.NoOp.INSTANCE, false);
        }

        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
        public Identified.Narrowable type(ElementMatcher<? super TypeDescription> elementMatcher) {
            return type(elementMatcher, ElementMatchers.any());
        }

        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
        public Identified.Narrowable type(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2) {
            return type(elementMatcher, elementMatcher2, ElementMatchers.any());
        }

        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
        public Identified.Narrowable type(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2, ElementMatcher<? super JavaModule> elementMatcher3) {
            return type(new RawMatcher.ForElementMatchers(elementMatcher, elementMatcher2, ElementMatchers.not(ElementMatchers.supportsModules()).or(elementMatcher3)));
        }

        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
        public Ignored ignore(ElementMatcher<? super TypeDescription> elementMatcher) {
            return ignore(elementMatcher, ElementMatchers.any());
        }

        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
        public Ignored ignore(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2) {
            return ignore(elementMatcher, elementMatcher2, ElementMatchers.any());
        }

        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
        public Ignored ignore(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2, ElementMatcher<? super JavaModule> elementMatcher3) {
            return ignore(new RawMatcher.ForElementMatchers(elementMatcher, elementMatcher2, ElementMatchers.not(ElementMatchers.supportsModules()).or(elementMatcher3)));
        }

        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
        public Ignored ignore(RawMatcher rawMatcher) {
            return new Ignoring(rawMatcher);
        }

        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
        public ResettableClassFileTransformer makeRaw() {
            return makeRaw(this.listener, InstallationListener.NoOp.INSTANCE);
        }

        private ResettableClassFileTransformer makeRaw(Listener listener, InstallationListener installationListener) {
            return ExecutingTransformer.FACTORY.make(this.byteBuddy, listener, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.nativeMethodStrategy, this.initializationStrategy, this.bootstrapInjectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, installationListener, this.ignoredTypeMatcher, this.transformation, this.circularityLock);
        }

        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
        public ResettableClassFileTransformer installOn(Instrumentation instrumentation) {
            ResettableClassFileTransformer resettableClassFileTransformer;
            Instrumentation instrumentation2;
            Default r1 = this;
            if (!r1.circularityLock.acquire()) {
                throw new IllegalStateException("Could not acquire the circularity lock upon installation.");
            }
            try {
                RedefinitionStrategy.ResubmissionStrategy.Installation apply = r1.redefinitionResubmissionStrategy.apply(instrumentation, r1.locationStrategy, r1.listener, r1.installationListener, r1.circularityLock, new RawMatcher.Conjunction(new RawMatcher.Inversion(r1.ignoredTypeMatcher), r1.transformation), r1.redefinitionStrategy, r1.redefinitionBatchAllocator, r1.redefinitionListener);
                ResettableClassFileTransformer makeRaw = r1.makeRaw(apply.getListener(), apply.getInstallationListener());
                apply.getInstallationListener().onBeforeInstall(instrumentation, makeRaw);
                try {
                    instrumentation.addTransformer(makeRaw, r1.redefinitionStrategy.isRetransforming());
                    if (r1.nativeMethodStrategy.isEnabled(instrumentation)) {
                        instrumentation.setNativeMethodPrefix(makeRaw, r1.nativeMethodStrategy.getPrefix());
                    }
                    r1.lambdaInstrumentationStrategy.apply(r1.byteBuddy, instrumentation, makeRaw);
                    if (r1.redefinitionStrategy.isEnabled()) {
                        RedefinitionStrategy redefinitionStrategy = r1.redefinitionStrategy;
                        Listener listener = apply.getListener();
                        CircularityLock circularityLock = r1.circularityLock;
                        PoolStrategy poolStrategy = r1.poolStrategy;
                        LocationStrategy locationStrategy = r1.locationStrategy;
                        RedefinitionStrategy.DiscoveryStrategy discoveryStrategy = r1.redefinitionDiscoveryStrategy;
                        RedefinitionStrategy.BatchAllocator batchAllocator = r1.redefinitionBatchAllocator;
                        RedefinitionStrategy.Listener listener2 = r1.redefinitionListener;
                        LambdaInstrumentationStrategy lambdaInstrumentationStrategy = r1.lambdaInstrumentationStrategy;
                        DescriptionStrategy descriptionStrategy = r1.descriptionStrategy;
                        FallbackStrategy fallbackStrategy = r1.fallbackStrategy;
                        Transformation transformation = r1.transformation;
                        RawMatcher rawMatcher = r1.ignoredTypeMatcher;
                        resettableClassFileTransformer = makeRaw;
                        try {
                            redefinitionStrategy.apply(instrumentation, listener, circularityLock, poolStrategy, locationStrategy, discoveryStrategy, batchAllocator, listener2, lambdaInstrumentationStrategy, descriptionStrategy, fallbackStrategy, transformation, rawMatcher);
                        } catch (Throwable th) {
                            th = th;
                            try {
                                instrumentation2 = instrumentation;
                                Throwable onError = apply.getInstallationListener().onError(instrumentation2, resettableClassFileTransformer, th);
                                if (onError != null) {
                                    ResettableClassFileTransformer resettableClassFileTransformer2 = resettableClassFileTransformer;
                                    r1 = this;
                                    instrumentation2.removeTransformer(resettableClassFileTransformer2);
                                    throw new IllegalStateException("Could not install class file transformer", onError);
                                }
                                apply.getInstallationListener().onInstall(instrumentation2, resettableClassFileTransformer);
                                ResettableClassFileTransformer resettableClassFileTransformer3 = resettableClassFileTransformer;
                                this.circularityLock.release();
                                return resettableClassFileTransformer3;
                            } catch (Throwable th2) {
                                th = th2;
                                r1 = this;
                                r1.circularityLock.release();
                                throw th;
                            }
                        }
                    } else {
                        resettableClassFileTransformer = makeRaw;
                    }
                    instrumentation2 = instrumentation;
                } catch (Throwable th3) {
                    th = th3;
                    resettableClassFileTransformer = makeRaw;
                }
                apply.getInstallationListener().onInstall(instrumentation2, resettableClassFileTransformer);
                ResettableClassFileTransformer resettableClassFileTransformer32 = resettableClassFileTransformer;
                this.circularityLock.release();
                return resettableClassFileTransformer32;
            } catch (Throwable th4) {
                th = th4;
            }
        }

        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
        public ResettableClassFileTransformer installOnByteBuddyAgent() {
            try {
                return installOn((Instrumentation) ClassLoader.getSystemClassLoader().loadClass(INSTALLER_TYPE).getMethod(INSTRUMENTATION_GETTER, new Class[0]).invoke(STATIC_MEMBER, new Object[0]));
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw new IllegalStateException("The Byte Buddy agent is not installed or not accessible", e2);
            }
        }

        protected interface BootstrapInjectionStrategy {
            ClassInjector make(ProtectionDomain protectionDomain);

            public enum Disabled implements BootstrapInjectionStrategy {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Default.BootstrapInjectionStrategy
                public ClassInjector make(ProtectionDomain protectionDomain) {
                    throw new IllegalStateException("Injecting classes into the bootstrap class loader was not enabled");
                }
            }

            public enum Unsafe implements BootstrapInjectionStrategy {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Default.BootstrapInjectionStrategy
                public ClassInjector make(ProtectionDomain protectionDomain) {
                    return new ClassInjector.UsingUnsafe(ClassLoadingStrategy.BOOTSTRAP_LOADER, protectionDomain);
                }

                @Override // java.lang.Enum
                public String toString() {
                    return "AgentBuilder.Default.BootstrapInjectionStrategy.Unsafe." + name();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class Enabled implements BootstrapInjectionStrategy {
                private final File folder;
                private final Instrumentation instrumentation;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Enabled enabled = (Enabled) obj;
                    return this.folder.equals(enabled.folder) && this.instrumentation.equals(enabled.instrumentation);
                }

                public int hashCode() {
                    return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.folder.hashCode()) * 31) + this.instrumentation.hashCode();
                }

                public Enabled(File file, Instrumentation instrumentation) {
                    this.folder = file;
                    this.instrumentation = instrumentation;
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Default.BootstrapInjectionStrategy
                public ClassInjector make(ProtectionDomain protectionDomain) {
                    return ClassInjector.UsingInstrumentation.of(this.folder, ClassInjector.UsingInstrumentation.Target.BOOTSTRAP, this.instrumentation);
                }
            }
        }

        protected interface NativeMethodStrategy {
            String getPrefix();

            boolean isEnabled(Instrumentation instrumentation);

            MethodNameTransformer resolve();

            public enum Disabled implements NativeMethodStrategy {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Default.NativeMethodStrategy
                public boolean isEnabled(Instrumentation instrumentation) {
                    return false;
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Default.NativeMethodStrategy
                public MethodNameTransformer resolve() {
                    return MethodNameTransformer.Suffixing.withRandomSuffix();
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Default.NativeMethodStrategy
                public String getPrefix() {
                    throw new IllegalStateException("A disabled native method strategy does not define a method name prefix");
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForPrefix implements NativeMethodStrategy {
                private final String prefix;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.prefix.equals(((ForPrefix) obj).prefix);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.prefix.hashCode();
                }

                protected ForPrefix(String str) {
                    this.prefix = str;
                }

                protected static NativeMethodStrategy of(String str) {
                    if (str.length() == 0) {
                        throw new IllegalArgumentException("A method name prefix must not be the empty string");
                    }
                    return new ForPrefix(str);
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Default.NativeMethodStrategy
                public MethodNameTransformer resolve() {
                    return new MethodNameTransformer.Prefixing(this.prefix);
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Default.NativeMethodStrategy
                public boolean isEnabled(Instrumentation instrumentation) {
                    if (instrumentation.isNativeMethodPrefixSupported()) {
                        return true;
                    }
                    throw new IllegalArgumentException("A prefix for native methods is not supported: " + instrumentation);
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Default.NativeMethodStrategy
                public String getPrefix() {
                    return this.prefix;
                }
            }
        }

        protected interface Transformation extends RawMatcher {
            Resolution resolve(TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule, Class<?> cls, boolean z, ProtectionDomain protectionDomain, TypePool typePool);

            public interface Resolution {

                public interface Decoratable extends Resolution {
                    Resolution append(Transformer transformer);
                }

                byte[] apply(InitializationStrategy initializationStrategy, ClassFileLocator classFileLocator, TypeStrategy typeStrategy, ByteBuddy byteBuddy, NativeMethodStrategy nativeMethodStrategy, BootstrapInjectionStrategy bootstrapInjectionStrategy, AccessControlContext accessControlContext, Listener listener);

                Resolution asDecoratorOf(Resolution resolution);

                Sort getSort();

                Resolution prepend(Decoratable decoratable);

                public enum Sort {
                    TERMINAL(true),
                    DECORATOR(true),
                    UNDEFINED(false);

                    private final boolean alive;

                    Sort(boolean z) {
                        this.alive = z;
                    }

                    protected boolean isAlive() {
                        return this.alive;
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class Unresolved implements Resolution {
                    private final ClassLoader classLoader;
                    private final boolean loaded;
                    private final JavaModule module;
                    private final TypeDescription typeDescription;

                    @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Default.Transformation.Resolution
                    public Resolution asDecoratorOf(Resolution resolution) {
                        return resolution;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        Unresolved unresolved = (Unresolved) obj;
                        return this.typeDescription.equals(unresolved.typeDescription) && this.classLoader.equals(unresolved.classLoader) && this.module.equals(unresolved.module) && this.loaded == unresolved.loaded;
                    }

                    public int hashCode() {
                        return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeDescription.hashCode()) * 31) + this.classLoader.hashCode()) * 31) + this.module.hashCode()) * 31) + (this.loaded ? 1 : 0);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Default.Transformation.Resolution
                    public Resolution prepend(Decoratable decoratable) {
                        return decoratable;
                    }

                    protected Unresolved(TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule, boolean z) {
                        this.typeDescription = typeDescription;
                        this.classLoader = classLoader;
                        this.module = javaModule;
                        this.loaded = z;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Default.Transformation.Resolution
                    public Sort getSort() {
                        return Sort.UNDEFINED;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Default.Transformation.Resolution
                    public byte[] apply(InitializationStrategy initializationStrategy, ClassFileLocator classFileLocator, TypeStrategy typeStrategy, ByteBuddy byteBuddy, NativeMethodStrategy nativeMethodStrategy, BootstrapInjectionStrategy bootstrapInjectionStrategy, AccessControlContext accessControlContext, Listener listener) {
                        listener.onIgnored(this.typeDescription, this.classLoader, this.module, this.loaded);
                        return Default.NO_TRANSFORMATION;
                    }
                }
            }

            public enum Ignored implements Transformation {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RawMatcher
                public boolean matches(TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule, Class<?> cls, ProtectionDomain protectionDomain) {
                    return false;
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Default.Transformation
                public Resolution resolve(TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule, Class<?> cls, boolean z, ProtectionDomain protectionDomain, TypePool typePool) {
                    return new Resolution.Unresolved(typeDescription, classLoader, javaModule, z);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class Simple implements Transformation {
                private final boolean decorator;
                private final RawMatcher rawMatcher;
                private final Transformer transformer;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Simple simple = (Simple) obj;
                    return this.rawMatcher.equals(simple.rawMatcher) && this.transformer.equals(simple.transformer) && this.decorator == simple.decorator;
                }

                public int hashCode() {
                    return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.rawMatcher.hashCode()) * 31) + this.transformer.hashCode()) * 31) + (this.decorator ? 1 : 0);
                }

                protected Simple(RawMatcher rawMatcher, Transformer transformer, boolean z) {
                    this.rawMatcher = rawMatcher;
                    this.transformer = transformer;
                    this.decorator = z;
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RawMatcher
                public boolean matches(TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule, Class<?> cls, ProtectionDomain protectionDomain) {
                    return this.rawMatcher.matches(typeDescription, classLoader, javaModule, cls, protectionDomain);
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Default.Transformation
                public Resolution resolve(TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule, Class<?> cls, boolean z, ProtectionDomain protectionDomain, TypePool typePool) {
                    return matches(typeDescription, classLoader, javaModule, cls, protectionDomain) ? new Resolution(typeDescription, classLoader, javaModule, protectionDomain, z, typePool, this.transformer, this.decorator) : new Resolution.Unresolved(typeDescription, classLoader, javaModule, z);
                }

                @HashCodeAndEqualsPlugin.Enhance
                protected static class Resolution implements Resolution.Decoratable {
                    private final ClassLoader classLoader;
                    private final boolean decorator;
                    private final boolean loaded;
                    private final JavaModule module;
                    private final ProtectionDomain protectionDomain;
                    private final Transformer transformer;
                    private final TypeDescription typeDescription;
                    private final TypePool typePool;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        Resolution resolution = (Resolution) obj;
                        return this.typeDescription.equals(resolution.typeDescription) && this.classLoader.equals(resolution.classLoader) && this.module.equals(resolution.module) && this.protectionDomain.equals(resolution.protectionDomain) && this.loaded == resolution.loaded && this.typePool.equals(resolution.typePool) && this.transformer.equals(resolution.transformer) && this.decorator == resolution.decorator;
                    }

                    public int hashCode() {
                        return ((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeDescription.hashCode()) * 31) + this.classLoader.hashCode()) * 31) + this.module.hashCode()) * 31) + this.protectionDomain.hashCode()) * 31) + (this.loaded ? 1 : 0)) * 31) + this.typePool.hashCode()) * 31) + this.transformer.hashCode()) * 31) + (this.decorator ? 1 : 0);
                    }

                    protected Resolution(TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule, ProtectionDomain protectionDomain, boolean z, TypePool typePool, Transformer transformer, boolean z2) {
                        this.typeDescription = typeDescription;
                        this.classLoader = classLoader;
                        this.module = javaModule;
                        this.protectionDomain = protectionDomain;
                        this.loaded = z;
                        this.typePool = typePool;
                        this.transformer = transformer;
                        this.decorator = z2;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Default.Transformation.Resolution
                    public Resolution.Sort getSort() {
                        return this.decorator ? Resolution.Sort.DECORATOR : Resolution.Sort.TERMINAL;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Default.Transformation.Resolution
                    public Resolution asDecoratorOf(Resolution resolution) {
                        return resolution.prepend(this);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Default.Transformation.Resolution
                    public Resolution prepend(Resolution.Decoratable decoratable) {
                        return decoratable.append(this.transformer);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Default.Transformation.Resolution.Decoratable
                    public Resolution append(Transformer transformer) {
                        return new Resolution(this.typeDescription, this.classLoader, this.module, this.protectionDomain, this.loaded, this.typePool, new Transformer.Compound(this.transformer, transformer), this.decorator);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Default.Transformation.Resolution
                    public byte[] apply(InitializationStrategy initializationStrategy, ClassFileLocator classFileLocator, TypeStrategy typeStrategy, ByteBuddy byteBuddy, NativeMethodStrategy nativeMethodStrategy, BootstrapInjectionStrategy bootstrapInjectionStrategy, AccessControlContext accessControlContext, Listener listener) {
                        InitializationStrategy.Dispatcher dispatcher = initializationStrategy.dispatcher();
                        DynamicType.Unloaded<?> make = dispatcher.apply(this.transformer.transform(typeStrategy.builder(this.typeDescription, byteBuddy, classFileLocator, nativeMethodStrategy.resolve(), this.classLoader, this.module, this.protectionDomain), this.typeDescription, this.classLoader, this.module)).make(TypeResolutionStrategy.Disabled.INSTANCE, this.typePool);
                        dispatcher.register(make, this.classLoader, new BootstrapClassLoaderCapableInjectorFactory(bootstrapInjectionStrategy, this.classLoader, this.protectionDomain));
                        listener.onTransformation(this.typeDescription, this.classLoader, this.module, this.loaded, make);
                        return make.getBytes();
                    }

                    @HashCodeAndEqualsPlugin.Enhance
                    protected static class BootstrapClassLoaderCapableInjectorFactory implements InitializationStrategy.Dispatcher.InjectorFactory {
                        private final BootstrapInjectionStrategy bootstrapInjectionStrategy;
                        private final ClassLoader classLoader;
                        private final ProtectionDomain protectionDomain;

                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj == null || getClass() != obj.getClass()) {
                                return false;
                            }
                            BootstrapClassLoaderCapableInjectorFactory bootstrapClassLoaderCapableInjectorFactory = (BootstrapClassLoaderCapableInjectorFactory) obj;
                            return this.bootstrapInjectionStrategy.equals(bootstrapClassLoaderCapableInjectorFactory.bootstrapInjectionStrategy) && this.classLoader.equals(bootstrapClassLoaderCapableInjectorFactory.classLoader) && this.protectionDomain.equals(bootstrapClassLoaderCapableInjectorFactory.protectionDomain);
                        }

                        public int hashCode() {
                            return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.bootstrapInjectionStrategy.hashCode()) * 31) + this.classLoader.hashCode()) * 31) + this.protectionDomain.hashCode();
                        }

                        protected BootstrapClassLoaderCapableInjectorFactory(BootstrapInjectionStrategy bootstrapInjectionStrategy, ClassLoader classLoader, ProtectionDomain protectionDomain) {
                            this.bootstrapInjectionStrategy = bootstrapInjectionStrategy;
                            this.classLoader = classLoader;
                            this.protectionDomain = protectionDomain;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.Dispatcher.InjectorFactory
                        public ClassInjector resolve() {
                            return this.classLoader == null ? this.bootstrapInjectionStrategy.make(this.protectionDomain) : new ClassInjector.UsingReflection(this.classLoader, this.protectionDomain);
                        }
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class Compound implements Transformation {
                private final List<Transformation> transformations;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.transformations.equals(((Compound) obj).transformations);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.transformations.hashCode();
                }

                protected Compound(Transformation... transformationArr) {
                    this((List<? extends Transformation>) Arrays.asList(transformationArr));
                }

                protected Compound(List<? extends Transformation> list) {
                    this.transformations = new ArrayList();
                    for (Transformation transformation : list) {
                        if (transformation instanceof Compound) {
                            this.transformations.addAll(((Compound) transformation).transformations);
                        } else if (!(transformation instanceof Ignored)) {
                            this.transformations.add(transformation);
                        }
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RawMatcher
                public boolean matches(TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule, Class<?> cls, ProtectionDomain protectionDomain) {
                    Iterator<Transformation> it = this.transformations.iterator();
                    while (it.hasNext()) {
                        if (it.next().matches(typeDescription, classLoader, javaModule, cls, protectionDomain)) {
                            return true;
                        }
                    }
                    return false;
                }

                @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Default.Transformation
                public Resolution resolve(TypeDescription typeDescription, ClassLoader classLoader, JavaModule javaModule, Class<?> cls, boolean z, ProtectionDomain protectionDomain, TypePool typePool) {
                    boolean z2;
                    TypeDescription typeDescription2;
                    ClassLoader classLoader2;
                    JavaModule javaModule2;
                    if (cls != null) {
                        typeDescription2 = typeDescription;
                        classLoader2 = classLoader;
                        javaModule2 = javaModule;
                        z2 = true;
                    } else {
                        z2 = false;
                        typeDescription2 = typeDescription;
                        classLoader2 = classLoader;
                        javaModule2 = javaModule;
                    }
                    Resolution unresolved = new Resolution.Unresolved(typeDescription2, classLoader2, javaModule2, z2);
                    Iterator<Transformation> it = this.transformations.iterator();
                    while (it.hasNext()) {
                        Resolution resolve = it.next().resolve(typeDescription, classLoader, javaModule, cls, z, protectionDomain, typePool);
                        int i = AnonymousClass1.$SwitchMap$net$bytebuddy$agent$builder$AgentBuilder$Default$Transformation$Resolution$Sort[resolve.getSort().ordinal()];
                        if (i == 1) {
                            return unresolved.asDecoratorOf(resolve);
                        }
                        if (i == 2) {
                            unresolved = unresolved.asDecoratorOf(resolve);
                        } else if (i != 3) {
                            throw new IllegalStateException("Unexpected resolution type: " + resolve.getSort());
                        }
                    }
                    return unresolved;
                }
            }
        }

        protected static class ExecutingTransformer extends ResettableClassFileTransformer.AbstractBase {
            protected static final Factory FACTORY = (Factory) AccessController.doPrivileged(Factory.CreationAction.INSTANCE);
            private final AccessControlContext accessControlContext = AccessController.getContext();
            private final BootstrapInjectionStrategy bootstrapInjectionStrategy;
            private final ByteBuddy byteBuddy;
            private final CircularityLock circularityLock;
            private final ClassFileBufferStrategy classFileBufferStrategy;
            private final DescriptionStrategy descriptionStrategy;
            private final FallbackStrategy fallbackStrategy;
            private final RawMatcher ignoredTypeMatcher;
            private final InitializationStrategy initializationStrategy;
            private final InstallationListener installationListener;
            private final LambdaInstrumentationStrategy lambdaInstrumentationStrategy;
            private final Listener listener;
            private final LocationStrategy locationStrategy;
            private final NativeMethodStrategy nativeMethodStrategy;
            private final PoolStrategy poolStrategy;
            private final Transformation transformation;
            private final TypeStrategy typeStrategy;

            public ExecutingTransformer(ByteBuddy byteBuddy, Listener listener, PoolStrategy poolStrategy, TypeStrategy typeStrategy, LocationStrategy locationStrategy, NativeMethodStrategy nativeMethodStrategy, InitializationStrategy initializationStrategy, BootstrapInjectionStrategy bootstrapInjectionStrategy, LambdaInstrumentationStrategy lambdaInstrumentationStrategy, DescriptionStrategy descriptionStrategy, FallbackStrategy fallbackStrategy, ClassFileBufferStrategy classFileBufferStrategy, InstallationListener installationListener, RawMatcher rawMatcher, Transformation transformation, CircularityLock circularityLock) {
                this.byteBuddy = byteBuddy;
                this.typeStrategy = typeStrategy;
                this.poolStrategy = poolStrategy;
                this.locationStrategy = locationStrategy;
                this.listener = listener;
                this.nativeMethodStrategy = nativeMethodStrategy;
                this.initializationStrategy = initializationStrategy;
                this.bootstrapInjectionStrategy = bootstrapInjectionStrategy;
                this.lambdaInstrumentationStrategy = lambdaInstrumentationStrategy;
                this.descriptionStrategy = descriptionStrategy;
                this.fallbackStrategy = fallbackStrategy;
                this.classFileBufferStrategy = classFileBufferStrategy;
                this.installationListener = installationListener;
                this.ignoredTypeMatcher = rawMatcher;
                this.transformation = transformation;
                this.circularityLock = circularityLock;
            }

            public byte[] transform(ClassLoader classLoader, String str, Class<?> cls, ProtectionDomain protectionDomain, byte[] bArr) {
                if (!this.circularityLock.acquire()) {
                    return Default.NO_TRANSFORMATION;
                }
                try {
                    return (byte[]) AccessController.doPrivileged(new LegacyVmDispatcher(classLoader, str, cls, protectionDomain, bArr), this.accessControlContext);
                } finally {
                    this.circularityLock.release();
                }
            }

            protected byte[] transform(Object obj, ClassLoader classLoader, String str, Class<?> cls, ProtectionDomain protectionDomain, byte[] bArr) {
                if (!this.circularityLock.acquire()) {
                    return Default.NO_TRANSFORMATION;
                }
                try {
                    return (byte[]) AccessController.doPrivileged(new Java9CapableVmDispatcher(obj, classLoader, str, cls, protectionDomain, bArr), this.accessControlContext);
                } finally {
                    this.circularityLock.release();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public byte[] transform(JavaModule javaModule, ClassLoader classLoader, String str, Class<?> cls, ProtectionDomain protectionDomain, byte[] bArr) {
                if (str == null || !this.lambdaInstrumentationStrategy.isInstrumented(cls)) {
                    return Default.NO_TRANSFORMATION;
                }
                String replace = str.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
                try {
                    this.listener.onDiscovery(replace, classLoader, javaModule, cls != null);
                    ClassFileLocator.Compound compound = new ClassFileLocator.Compound(this.classFileBufferStrategy.resolve(replace, bArr, classLoader, javaModule, protectionDomain), this.locationStrategy.classFileLocator(classLoader, javaModule));
                    TypePool typePool = this.poolStrategy.typePool(compound, classLoader);
                    try {
                        return doTransform(javaModule, classLoader, replace, cls, cls != null, protectionDomain, typePool, compound);
                    } catch (Throwable th) {
                        if (cls != null) {
                            if (!this.descriptionStrategy.isLoadedFirst()) {
                                throw th;
                            }
                            if (this.fallbackStrategy.isFallback(cls, th)) {
                                byte[] doTransform = doTransform(javaModule, classLoader, replace, Default.NO_LOADED_TYPE, true, protectionDomain, typePool, compound);
                                this.listener.onComplete(replace, classLoader, javaModule, cls != null);
                                return doTransform;
                            }
                            throw th;
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        this.listener.onError(replace, classLoader, javaModule, cls != null, th2);
                        byte[] bArr2 = Default.NO_TRANSFORMATION;
                        this.listener.onComplete(replace, classLoader, javaModule, cls != null);
                        return bArr2;
                    } finally {
                        this.listener.onComplete(replace, classLoader, javaModule, cls != null);
                    }
                }
            }

            private byte[] doTransform(JavaModule javaModule, ClassLoader classLoader, String str, Class<?> cls, boolean z, ProtectionDomain protectionDomain, TypePool typePool, ClassFileLocator classFileLocator) {
                return resolve(javaModule, classLoader, str, cls, z, protectionDomain, typePool).apply(this.initializationStrategy, classFileLocator, this.typeStrategy, this.byteBuddy, this.nativeMethodStrategy, this.bootstrapInjectionStrategy, this.accessControlContext, this.listener);
            }

            private Transformation.Resolution resolve(JavaModule javaModule, ClassLoader classLoader, String str, Class<?> cls, boolean z, ProtectionDomain protectionDomain, TypePool typePool) {
                TypeDescription apply = this.descriptionStrategy.apply(str, cls, typePool, this.circularityLock, classLoader, javaModule);
                return this.ignoredTypeMatcher.matches(apply, classLoader, javaModule, cls, protectionDomain) ? new Transformation.Resolution.Unresolved(apply, classLoader, javaModule, z) : this.transformation.resolve(apply, classLoader, javaModule, cls, z, protectionDomain, typePool);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.ResettableClassFileTransformer
            public synchronized boolean reset(Instrumentation instrumentation, RedefinitionStrategy redefinitionStrategy, RedefinitionStrategy.DiscoveryStrategy discoveryStrategy, RedefinitionStrategy.BatchAllocator batchAllocator, RedefinitionStrategy.Listener listener) {
                if (!instrumentation.removeTransformer(this)) {
                    return false;
                }
                redefinitionStrategy.apply(instrumentation, Listener.NoOp.INSTANCE, CircularityLock.Inactive.INSTANCE, this.poolStrategy, this.locationStrategy, discoveryStrategy, batchAllocator, listener, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.transformation, this.ignoredTypeMatcher);
                this.installationListener.onReset(instrumentation, this);
                return true;
            }

            protected interface Factory {
                ResettableClassFileTransformer make(ByteBuddy byteBuddy, Listener listener, PoolStrategy poolStrategy, TypeStrategy typeStrategy, LocationStrategy locationStrategy, NativeMethodStrategy nativeMethodStrategy, InitializationStrategy initializationStrategy, BootstrapInjectionStrategy bootstrapInjectionStrategy, LambdaInstrumentationStrategy lambdaInstrumentationStrategy, DescriptionStrategy descriptionStrategy, FallbackStrategy fallbackStrategy, ClassFileBufferStrategy classFileBufferStrategy, InstallationListener installationListener, RawMatcher rawMatcher, Transformation transformation, CircularityLock circularityLock);

                public enum CreationAction implements PrivilegedAction<Factory> {
                    INSTANCE;

                    @Override // java.security.PrivilegedAction
                    public Factory run() {
                        try {
                            return new ForJava9CapableVm(new ByteBuddy().with(TypeValidation.DISABLED).subclass(ExecutingTransformer.class).name(ExecutingTransformer.class.getName() + "$ByteBuddy$ModuleSupport").method(ElementMatchers.named("transform").and(ElementMatchers.takesArgument(0, JavaType.MODULE.load()))).intercept(MethodCall.invoke(ExecutingTransformer.class.getDeclaredMethod("transform", Object.class, ClassLoader.class, String.class, Class.class, ProtectionDomain.class, byte[].class)).onSuper().withAllArguments()).make().load(ExecutingTransformer.class.getClassLoader(), ClassLoadingStrategy.Default.WRAPPER_PERSISTENT.with(ExecutingTransformer.class.getProtectionDomain())).getLoaded().getDeclaredConstructor(ByteBuddy.class, Listener.class, PoolStrategy.class, TypeStrategy.class, LocationStrategy.class, NativeMethodStrategy.class, InitializationStrategy.class, BootstrapInjectionStrategy.class, LambdaInstrumentationStrategy.class, DescriptionStrategy.class, FallbackStrategy.class, ClassFileBufferStrategy.class, InstallationListener.class, RawMatcher.class, Transformation.class, CircularityLock.class));
                        } catch (Exception unused) {
                            return ForLegacyVm.INSTANCE;
                        }
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class ForJava9CapableVm implements Factory {
                    private final Constructor<? extends ResettableClassFileTransformer> executingTransformer;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.executingTransformer.equals(((ForJava9CapableVm) obj).executingTransformer);
                    }

                    public int hashCode() {
                        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.executingTransformer.hashCode();
                    }

                    protected ForJava9CapableVm(Constructor<? extends ResettableClassFileTransformer> constructor) {
                        this.executingTransformer = constructor;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Default.ExecutingTransformer.Factory
                    public ResettableClassFileTransformer make(ByteBuddy byteBuddy, Listener listener, PoolStrategy poolStrategy, TypeStrategy typeStrategy, LocationStrategy locationStrategy, NativeMethodStrategy nativeMethodStrategy, InitializationStrategy initializationStrategy, BootstrapInjectionStrategy bootstrapInjectionStrategy, LambdaInstrumentationStrategy lambdaInstrumentationStrategy, DescriptionStrategy descriptionStrategy, FallbackStrategy fallbackStrategy, ClassFileBufferStrategy classFileBufferStrategy, InstallationListener installationListener, RawMatcher rawMatcher, Transformation transformation, CircularityLock circularityLock) {
                        try {
                            return this.executingTransformer.newInstance(byteBuddy, listener, poolStrategy, typeStrategy, locationStrategy, nativeMethodStrategy, initializationStrategy, bootstrapInjectionStrategy, lambdaInstrumentationStrategy, descriptionStrategy, fallbackStrategy, classFileBufferStrategy, installationListener, rawMatcher, transformation, circularityLock);
                        } catch (IllegalAccessException e) {
                            throw new IllegalStateException("Cannot access " + this.executingTransformer, e);
                        } catch (InstantiationException e2) {
                            throw new IllegalStateException("Cannot instantiate " + this.executingTransformer.getDeclaringClass(), e2);
                        } catch (InvocationTargetException e3) {
                            throw new IllegalStateException("Cannot invoke " + this.executingTransformer, e3.getCause());
                        }
                    }
                }

                public enum ForLegacyVm implements Factory {
                    INSTANCE;

                    @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Default.ExecutingTransformer.Factory
                    public ResettableClassFileTransformer make(ByteBuddy byteBuddy, Listener listener, PoolStrategy poolStrategy, TypeStrategy typeStrategy, LocationStrategy locationStrategy, NativeMethodStrategy nativeMethodStrategy, InitializationStrategy initializationStrategy, BootstrapInjectionStrategy bootstrapInjectionStrategy, LambdaInstrumentationStrategy lambdaInstrumentationStrategy, DescriptionStrategy descriptionStrategy, FallbackStrategy fallbackStrategy, ClassFileBufferStrategy classFileBufferStrategy, InstallationListener installationListener, RawMatcher rawMatcher, Transformation transformation, CircularityLock circularityLock) {
                        return new ExecutingTransformer(byteBuddy, listener, poolStrategy, typeStrategy, locationStrategy, nativeMethodStrategy, initializationStrategy, bootstrapInjectionStrategy, lambdaInstrumentationStrategy, descriptionStrategy, fallbackStrategy, classFileBufferStrategy, installationListener, rawMatcher, transformation, circularityLock);
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
            protected class LegacyVmDispatcher implements PrivilegedAction<byte[]> {
                private final byte[] binaryRepresentation;
                private final Class<?> classBeingRedefined;
                private final ClassLoader classLoader;
                private final String internalTypeName;
                private final ProtectionDomain protectionDomain;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    LegacyVmDispatcher legacyVmDispatcher = (LegacyVmDispatcher) obj;
                    return this.classLoader.equals(legacyVmDispatcher.classLoader) && this.internalTypeName.equals(legacyVmDispatcher.internalTypeName) && this.classBeingRedefined.equals(legacyVmDispatcher.classBeingRedefined) && this.protectionDomain.equals(legacyVmDispatcher.protectionDomain) && Arrays.equals(this.binaryRepresentation, legacyVmDispatcher.binaryRepresentation) && ExecutingTransformer.this.equals(ExecutingTransformer.this);
                }

                public int hashCode() {
                    return ((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.classLoader.hashCode()) * 31) + this.internalTypeName.hashCode()) * 31) + this.classBeingRedefined.hashCode()) * 31) + this.protectionDomain.hashCode()) * 31) + Arrays.hashCode(this.binaryRepresentation)) * 31) + ExecutingTransformer.this.hashCode();
                }

                protected LegacyVmDispatcher(ClassLoader classLoader, String str, Class<?> cls, ProtectionDomain protectionDomain, byte[] bArr) {
                    this.classLoader = classLoader;
                    this.internalTypeName = str;
                    this.classBeingRedefined = cls;
                    this.protectionDomain = protectionDomain;
                    this.binaryRepresentation = bArr;
                }

                @Override // java.security.PrivilegedAction
                public byte[] run() {
                    return ExecutingTransformer.this.transform(JavaModule.UNSUPPORTED, this.classLoader, this.internalTypeName, this.classBeingRedefined, this.protectionDomain, this.binaryRepresentation);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
            protected class Java9CapableVmDispatcher implements PrivilegedAction<byte[]> {
                private final byte[] binaryRepresentation;
                private final Class<?> classBeingRedefined;
                private final ClassLoader classLoader;
                private final String internalTypeName;
                private final ProtectionDomain protectionDomain;
                private final Object rawModule;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Java9CapableVmDispatcher java9CapableVmDispatcher = (Java9CapableVmDispatcher) obj;
                    return this.rawModule.equals(java9CapableVmDispatcher.rawModule) && this.classLoader.equals(java9CapableVmDispatcher.classLoader) && this.internalTypeName.equals(java9CapableVmDispatcher.internalTypeName) && this.classBeingRedefined.equals(java9CapableVmDispatcher.classBeingRedefined) && this.protectionDomain.equals(java9CapableVmDispatcher.protectionDomain) && Arrays.equals(this.binaryRepresentation, java9CapableVmDispatcher.binaryRepresentation) && ExecutingTransformer.this.equals(ExecutingTransformer.this);
                }

                public int hashCode() {
                    return ((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.rawModule.hashCode()) * 31) + this.classLoader.hashCode()) * 31) + this.internalTypeName.hashCode()) * 31) + this.classBeingRedefined.hashCode()) * 31) + this.protectionDomain.hashCode()) * 31) + Arrays.hashCode(this.binaryRepresentation)) * 31) + ExecutingTransformer.this.hashCode();
                }

                protected Java9CapableVmDispatcher(Object obj, ClassLoader classLoader, String str, Class<?> cls, ProtectionDomain protectionDomain, byte[] bArr) {
                    this.rawModule = obj;
                    this.classLoader = classLoader;
                    this.internalTypeName = str;
                    this.classBeingRedefined = cls;
                    this.protectionDomain = protectionDomain;
                    this.binaryRepresentation = bArr;
                }

                @Override // java.security.PrivilegedAction
                public byte[] run() {
                    return ExecutingTransformer.this.transform(JavaModule.of(this.rawModule), this.classLoader, this.internalTypeName, this.classBeingRedefined, this.protectionDomain, this.binaryRepresentation);
                }
            }
        }

        protected abstract class Delegator<T extends Matchable<T>> extends Matchable.AbstractBase<T> implements AgentBuilder {
            protected abstract AgentBuilder materialize();

            protected Delegator() {
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder with(ByteBuddy byteBuddy) {
                return materialize().with(byteBuddy);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder with(Listener listener) {
                return materialize().with(listener);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder with(CircularityLock circularityLock) {
                return materialize().with(circularityLock);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder with(TypeStrategy typeStrategy) {
                return materialize().with(typeStrategy);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder with(PoolStrategy poolStrategy) {
                return materialize().with(poolStrategy);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder with(LocationStrategy locationStrategy) {
                return materialize().with(locationStrategy);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder with(InitializationStrategy initializationStrategy) {
                return materialize().with(initializationStrategy);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public RedefinitionListenable.WithoutBatchStrategy with(RedefinitionStrategy redefinitionStrategy) {
                return materialize().with(redefinitionStrategy);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder with(LambdaInstrumentationStrategy lambdaInstrumentationStrategy) {
                return materialize().with(lambdaInstrumentationStrategy);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder with(DescriptionStrategy descriptionStrategy) {
                return materialize().with(descriptionStrategy);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder with(FallbackStrategy fallbackStrategy) {
                return materialize().with(fallbackStrategy);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder with(ClassFileBufferStrategy classFileBufferStrategy) {
                return materialize().with(classFileBufferStrategy);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder with(InstallationListener installationListener) {
                return materialize().with(installationListener);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder enableBootstrapInjection(Instrumentation instrumentation, File file) {
                return materialize().enableBootstrapInjection(instrumentation, file);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder enableUnsafeBootstrapInjection() {
                return materialize().enableUnsafeBootstrapInjection();
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder disableBootstrapInjection() {
                return materialize().disableBootstrapInjection();
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder enableNativeMethodPrefix(String str) {
                return materialize().enableNativeMethodPrefix(str);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder disableNativeMethodPrefix() {
                return materialize().disableNativeMethodPrefix();
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder disableClassFormatChanges() {
                return materialize().disableClassFormatChanges();
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder assureReadEdgeTo(Instrumentation instrumentation, Class<?>... clsArr) {
                return materialize().assureReadEdgeTo(instrumentation, clsArr);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder assureReadEdgeTo(Instrumentation instrumentation, JavaModule... javaModuleArr) {
                return materialize().assureReadEdgeTo(instrumentation, javaModuleArr);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder assureReadEdgeTo(Instrumentation instrumentation, Collection<? extends JavaModule> collection) {
                return materialize().assureReadEdgeTo(instrumentation, collection);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder assureReadEdgeFromAndTo(Instrumentation instrumentation, Class<?>... clsArr) {
                return materialize().assureReadEdgeFromAndTo(instrumentation, clsArr);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder assureReadEdgeFromAndTo(Instrumentation instrumentation, JavaModule... javaModuleArr) {
                return materialize().assureReadEdgeFromAndTo(instrumentation, javaModuleArr);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public AgentBuilder assureReadEdgeFromAndTo(Instrumentation instrumentation, Collection<? extends JavaModule> collection) {
                return materialize().assureReadEdgeFromAndTo(instrumentation, collection);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public Identified.Narrowable type(ElementMatcher<? super TypeDescription> elementMatcher) {
                return materialize().type(elementMatcher);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public Identified.Narrowable type(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2) {
                return materialize().type(elementMatcher, elementMatcher2);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public Identified.Narrowable type(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2, ElementMatcher<? super JavaModule> elementMatcher3) {
                return materialize().type(elementMatcher, elementMatcher2, elementMatcher3);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public Identified.Narrowable type(RawMatcher rawMatcher) {
                return materialize().type(rawMatcher);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public Ignored ignore(ElementMatcher<? super TypeDescription> elementMatcher) {
                return materialize().ignore(elementMatcher);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public Ignored ignore(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2) {
                return materialize().ignore(elementMatcher, elementMatcher2);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public Ignored ignore(ElementMatcher<? super TypeDescription> elementMatcher, ElementMatcher<? super ClassLoader> elementMatcher2, ElementMatcher<? super JavaModule> elementMatcher3) {
                return materialize().ignore(elementMatcher, elementMatcher2, elementMatcher3);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public Ignored ignore(RawMatcher rawMatcher) {
                return materialize().ignore(rawMatcher);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public ClassFileTransformer makeRaw() {
                return materialize().makeRaw();
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public ResettableClassFileTransformer installOn(Instrumentation instrumentation) {
                return materialize().installOn(instrumentation);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public ResettableClassFileTransformer installOnByteBuddyAgent() {
                return materialize().installOnByteBuddyAgent();
            }
        }

        @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
        protected class Ignoring extends Delegator<Ignored> implements Ignored {
            private final RawMatcher rawMatcher;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Ignoring ignoring = (Ignoring) obj;
                return this.rawMatcher.equals(ignoring.rawMatcher) && Default.this.equals(Default.this);
            }

            public int hashCode() {
                return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.rawMatcher.hashCode()) * 31) + Default.this.hashCode();
            }

            protected Ignoring(RawMatcher rawMatcher) {
                super();
                this.rawMatcher = rawMatcher;
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Default.Delegator
            protected AgentBuilder materialize() {
                return new Default(Default.this.byteBuddy, Default.this.listener, Default.this.circularityLock, Default.this.poolStrategy, Default.this.typeStrategy, Default.this.locationStrategy, Default.this.nativeMethodStrategy, Default.this.initializationStrategy, Default.this.redefinitionStrategy, Default.this.redefinitionDiscoveryStrategy, Default.this.redefinitionBatchAllocator, Default.this.redefinitionListener, Default.this.redefinitionResubmissionStrategy, Default.this.bootstrapInjectionStrategy, Default.this.lambdaInstrumentationStrategy, Default.this.descriptionStrategy, Default.this.fallbackStrategy, Default.this.classFileBufferStrategy, Default.this.installationListener, this.rawMatcher, Default.this.transformation);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Matchable
            public Ignored and(RawMatcher rawMatcher) {
                return Default.this.new Ignoring(new RawMatcher.Conjunction(this.rawMatcher, rawMatcher));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Matchable
            public Ignored or(RawMatcher rawMatcher) {
                return Default.this.new Ignoring(new RawMatcher.Disjunction(this.rawMatcher, rawMatcher));
            }
        }

        protected static class Redefining extends Default implements RedefinitionListenable.WithoutBatchStrategy {
            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Default, org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder
            public /* bridge */ /* synthetic */ ClassFileTransformer makeRaw() {
                return super.makeRaw();
            }

            protected Redefining(ByteBuddy byteBuddy, Listener listener, CircularityLock circularityLock, PoolStrategy poolStrategy, TypeStrategy typeStrategy, LocationStrategy locationStrategy, NativeMethodStrategy nativeMethodStrategy, InitializationStrategy initializationStrategy, RedefinitionStrategy redefinitionStrategy, RedefinitionStrategy.DiscoveryStrategy discoveryStrategy, RedefinitionStrategy.BatchAllocator batchAllocator, RedefinitionStrategy.Listener listener2, RedefinitionStrategy.ResubmissionStrategy resubmissionStrategy, BootstrapInjectionStrategy bootstrapInjectionStrategy, LambdaInstrumentationStrategy lambdaInstrumentationStrategy, DescriptionStrategy descriptionStrategy, FallbackStrategy fallbackStrategy, ClassFileBufferStrategy classFileBufferStrategy, InstallationListener installationListener, RawMatcher rawMatcher, Transformation transformation) {
                super(byteBuddy, listener, circularityLock, poolStrategy, typeStrategy, locationStrategy, nativeMethodStrategy, initializationStrategy, redefinitionStrategy, discoveryStrategy, batchAllocator, listener2, resubmissionStrategy, bootstrapInjectionStrategy, lambdaInstrumentationStrategy, descriptionStrategy, fallbackStrategy, classFileBufferStrategy, installationListener, rawMatcher, transformation);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionListenable.WithoutBatchStrategy
            public RedefinitionListenable.WithImplicitDiscoveryStrategy with(RedefinitionStrategy.BatchAllocator batchAllocator) {
                if (!this.redefinitionStrategy.isEnabled()) {
                    throw new IllegalStateException("Cannot set redefinition batch allocator when redefinition is disabled");
                }
                return new Redefining(this.byteBuddy, this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.nativeMethodStrategy, this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, batchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.bootstrapInjectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoredTypeMatcher, this.transformation);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionListenable.WithImplicitDiscoveryStrategy
            public RedefinitionListenable redefineOnly(Class<?>... clsArr) {
                return with(new RedefinitionStrategy.DiscoveryStrategy.Explicit(clsArr));
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionListenable.WithImplicitDiscoveryStrategy
            public RedefinitionListenable with(RedefinitionStrategy.DiscoveryStrategy discoveryStrategy) {
                if (!this.redefinitionStrategy.isEnabled()) {
                    throw new IllegalStateException("Cannot set redefinition discovery strategy when redefinition is disabled");
                }
                return new Redefining(this.byteBuddy, this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.nativeMethodStrategy, this.initializationStrategy, this.redefinitionStrategy, discoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, this.redefinitionResubmissionStrategy, this.bootstrapInjectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoredTypeMatcher, this.transformation);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionListenable
            public RedefinitionListenable with(RedefinitionStrategy.Listener listener) {
                if (!this.redefinitionStrategy.isEnabled()) {
                    throw new IllegalStateException("Cannot set redefinition listener when redefinition is disabled");
                }
                return new Redefining(this.byteBuddy, this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.nativeMethodStrategy, this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, new RedefinitionStrategy.Listener.Compound(this.redefinitionListener, listener), this.redefinitionResubmissionStrategy, this.bootstrapInjectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoredTypeMatcher, this.transformation);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionListenable
            public AgentBuilder withResubmission(RedefinitionStrategy.ResubmissionScheduler resubmissionScheduler) {
                return withResubmission(resubmissionScheduler, ElementMatchers.any());
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.RedefinitionListenable
            public AgentBuilder withResubmission(RedefinitionStrategy.ResubmissionScheduler resubmissionScheduler, ElementMatcher<? super Throwable> elementMatcher) {
                if (!this.redefinitionStrategy.isEnabled()) {
                    throw new IllegalStateException("Cannot enable redefinition resubmission when redefinition is disabled");
                }
                return new Redefining(this.byteBuddy, this.listener, this.circularityLock, this.poolStrategy, this.typeStrategy, this.locationStrategy, this.nativeMethodStrategy, this.initializationStrategy, this.redefinitionStrategy, this.redefinitionDiscoveryStrategy, this.redefinitionBatchAllocator, this.redefinitionListener, new RedefinitionStrategy.ResubmissionStrategy.Enabled(resubmissionScheduler, elementMatcher), this.bootstrapInjectionStrategy, this.lambdaInstrumentationStrategy, this.descriptionStrategy, this.fallbackStrategy, this.classFileBufferStrategy, this.installationListener, this.ignoredTypeMatcher, this.transformation);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
        protected class Transforming extends Delegator<Identified.Narrowable> implements Identified.Extendable, Identified.Narrowable {
            private final boolean decorator;
            private final RawMatcher rawMatcher;
            private final Transformer transformer;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Transforming transforming = (Transforming) obj;
                return this.rawMatcher.equals(transforming.rawMatcher) && this.transformer.equals(transforming.transformer) && this.decorator == transforming.decorator && Default.this.equals(Default.this);
            }

            public int hashCode() {
                return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.rawMatcher.hashCode()) * 31) + this.transformer.hashCode()) * 31) + (this.decorator ? 1 : 0)) * 31) + Default.this.hashCode();
            }

            protected Transforming(RawMatcher rawMatcher, Transformer transformer, boolean z) {
                super();
                this.rawMatcher = rawMatcher;
                this.transformer = transformer;
                this.decorator = z;
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Default.Delegator
            protected AgentBuilder materialize() {
                return new Default(Default.this.byteBuddy, Default.this.listener, Default.this.circularityLock, Default.this.poolStrategy, Default.this.typeStrategy, Default.this.locationStrategy, Default.this.nativeMethodStrategy, Default.this.initializationStrategy, Default.this.redefinitionStrategy, Default.this.redefinitionDiscoveryStrategy, Default.this.redefinitionBatchAllocator, Default.this.redefinitionListener, Default.this.redefinitionResubmissionStrategy, Default.this.bootstrapInjectionStrategy, Default.this.lambdaInstrumentationStrategy, Default.this.descriptionStrategy, Default.this.fallbackStrategy, Default.this.classFileBufferStrategy, Default.this.installationListener, Default.this.ignoredTypeMatcher, new Transformation.Compound(new Transformation.Simple(this.rawMatcher, this.transformer, this.decorator), Default.this.transformation));
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Identified
            public Identified.Extendable transform(Transformer transformer) {
                return Default.this.new Transforming(this.rawMatcher, new Transformer.Compound(this.transformer, transformer), this.decorator);
            }

            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Identified.Extendable
            public AgentBuilder asDecorator() {
                return Default.this.new Transforming(this.rawMatcher, this.transformer, true);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Matchable
            public Identified.Narrowable and(RawMatcher rawMatcher) {
                return Default.this.new Transforming(new RawMatcher.Conjunction(this.rawMatcher, rawMatcher), this.transformer, this.decorator);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder.Matchable
            public Identified.Narrowable or(RawMatcher rawMatcher) {
                return Default.this.new Transforming(new RawMatcher.Disjunction(this.rawMatcher, rawMatcher), this.transformer, this.decorator);
            }
        }
    }

    /* renamed from: org.modelmapper.internal.bytebuddy.agent.builder.AgentBuilder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$net$bytebuddy$agent$builder$AgentBuilder$Default$Transformation$Resolution$Sort;

        static {
            int[] iArr = new int[Default.Transformation.Resolution.Sort.values().length];
            $SwitchMap$net$bytebuddy$agent$builder$AgentBuilder$Default$Transformation$Resolution$Sort = iArr;
            try {
                iArr[Default.Transformation.Resolution.Sort.TERMINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$bytebuddy$agent$builder$AgentBuilder$Default$Transformation$Resolution$Sort[Default.Transformation.Resolution.Sort.DECORATOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$net$bytebuddy$agent$builder$AgentBuilder$Default$Transformation$Resolution$Sort[Default.Transformation.Resolution.Sort.UNDEFINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
