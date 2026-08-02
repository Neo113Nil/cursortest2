package org.modelmapper.internal.bytebuddy.dynamic.scaffold;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.ironsource.O6;
import com.vk.sdk.api.VKApiConst;
import io.sentry.profilemeasurements.ProfileMeasurement;
import io.sentry.protocol.SentryStackFrame;
import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationDescription;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationList;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationValue;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.field.FieldList;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodList;
import org.modelmapper.internal.bytebuddy.description.method.ParameterDescription;
import org.modelmapper.internal.bytebuddy.description.modifier.ModifierContributor;
import org.modelmapper.internal.bytebuddy.description.type.PackageDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeList;
import org.modelmapper.internal.bytebuddy.description.type.TypeVariableToken;
import org.modelmapper.internal.bytebuddy.dynamic.TargetType;
import org.modelmapper.internal.bytebuddy.dynamic.Transformer;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeInitializer;
import org.modelmapper.internal.bytebuddy.implementation.LoadedTypeInitializer;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;
import org.modelmapper.internal.bytebuddy.utility.CompoundList;

/* loaded from: classes4.dex */
public interface InstrumentedType extends TypeDescription {

    public interface Prepareable {
        InstrumentedType prepare(InstrumentedType instrumentedType);
    }

    public interface WithFlexibleName extends InstrumentedType {
        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withAnnotations(List<? extends AnnotationDescription> list);

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withAnonymousClass(boolean z);

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withDeclaredTypes(TypeList typeList);

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withDeclaringType(TypeDescription typeDescription);

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withEnclosingMethod(MethodDescription.InDefinedShape inDefinedShape);

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withEnclosingType(TypeDescription typeDescription);

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withField(FieldDescription.Token token);

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withInitializer(LoadedTypeInitializer loadedTypeInitializer);

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withInitializer(ByteCodeAppender byteCodeAppender);

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withInterfaces(TypeList.Generic generic);

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withLocalClass(boolean z);

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withMethod(MethodDescription.Token token);

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withModifiers(int i);

        WithFlexibleName withName(String str);

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withNestHost(TypeDescription typeDescription);

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withNestMembers(TypeList typeList);

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        WithFlexibleName withTypeVariable(TypeVariableToken typeVariableToken);

        WithFlexibleName withTypeVariables(ElementMatcher<? super TypeDescription.Generic> elementMatcher, Transformer<TypeVariableToken> transformer);
    }

    LoadedTypeInitializer getLoadedTypeInitializer();

    TypeInitializer getTypeInitializer();

    TypeDescription validated();

    InstrumentedType withAnnotations(List<? extends AnnotationDescription> list);

    InstrumentedType withAnonymousClass(boolean z);

    InstrumentedType withDeclaredTypes(TypeList typeList);

    InstrumentedType withDeclaringType(TypeDescription typeDescription);

    InstrumentedType withEnclosingMethod(MethodDescription.InDefinedShape inDefinedShape);

    InstrumentedType withEnclosingType(TypeDescription typeDescription);

    InstrumentedType withField(FieldDescription.Token token);

    InstrumentedType withInitializer(LoadedTypeInitializer loadedTypeInitializer);

    InstrumentedType withInitializer(ByteCodeAppender byteCodeAppender);

    InstrumentedType withInterfaces(TypeList.Generic generic);

    InstrumentedType withLocalClass(boolean z);

    InstrumentedType withMethod(MethodDescription.Token token);

    InstrumentedType withModifiers(int i);

    InstrumentedType withNestHost(TypeDescription typeDescription);

    InstrumentedType withNestMembers(TypeList typeList);

    InstrumentedType withTypeVariable(TypeVariableToken typeVariableToken);

    public interface Factory {
        WithFlexibleName represent(TypeDescription typeDescription);

        WithFlexibleName subclass(String str, int i, TypeDescription.Generic generic);

        public enum Default implements Factory {
            MODIFIABLE { // from class: org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Factory.Default.1
                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Factory
                public WithFlexibleName represent(TypeDescription typeDescription) {
                    return new Default(typeDescription.getName(), typeDescription.getModifiers(), typeDescription.getSuperClass(), typeDescription.getTypeVariables().asTokenList(ElementMatchers.is(typeDescription)), typeDescription.getInterfaces().accept(TypeDescription.Generic.Visitor.Substitutor.ForDetachment.of(typeDescription)), typeDescription.getDeclaredFields().asTokenList(ElementMatchers.is(typeDescription)), typeDescription.getDeclaredMethods().asTokenList(ElementMatchers.is(typeDescription)), typeDescription.getDeclaredAnnotations(), TypeInitializer.None.INSTANCE, LoadedTypeInitializer.NoOp.INSTANCE, typeDescription.getDeclaringType(), typeDescription.getEnclosingMethod(), typeDescription.getEnclosingType(), typeDescription.getDeclaredTypes(), typeDescription.isAnonymousType(), typeDescription.isLocalType(), typeDescription.getNestHost().equals(typeDescription) ? TargetType.DESCRIPTION : typeDescription.getNestHost(), typeDescription.getNestMembers().filter(ElementMatchers.not(ElementMatchers.is(typeDescription))));
                }
            },
            FROZEN { // from class: org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Factory.Default.2
                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Factory
                public WithFlexibleName represent(TypeDescription typeDescription) {
                    return new Frozen(typeDescription, LoadedTypeInitializer.NoOp.INSTANCE);
                }
            };

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Factory
            public WithFlexibleName subclass(String str, int i, TypeDescription.Generic generic) {
                return new Default(str, i, generic, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), TypeInitializer.None.INSTANCE, LoadedTypeInitializer.NoOp.INSTANCE, TypeDescription.UNDEFINED, MethodDescription.UNDEFINED, TypeDescription.UNDEFINED, Collections.emptyList(), false, false, TargetType.DESCRIPTION, Collections.emptyList());
            }
        }
    }

    public static class Default extends TypeDescription.AbstractBase.OfSimpleType implements WithFlexibleName {
        private static final Set<String> KEYWORDS = new HashSet(Arrays.asList("abstract", "continue", "for", "new", "switch", "assert", "default", "goto", SentryStackFrame.JsonKeys.PACKAGE, "synchronized", TypedValues.Custom.S_BOOLEAN, O6.w1, "if", "private", "this", "break", "double", "implements", "protected", "throw", ProfileMeasurement.UNIT_BYTES, "else", "import", "public", "throws", "case", "enum", "instanceof", "return", FacebookRequestErrorClassification.KEY_TRANSIENT, "catch", "extends", "int", "short", "try", "char", "final", "interface", "static", "void", "class", "finally", VKApiConst.LONG, "strictfp", "volatile", "const", TypedValues.Custom.S_FLOAT, "native", "super", "while"));
        private final List<? extends AnnotationDescription> annotationDescriptions;
        private final boolean anonymousClass;
        private final List<? extends TypeDescription> declaredTypes;
        private final TypeDescription declaringType;
        private final MethodDescription.InDefinedShape enclosingMethod;
        private final TypeDescription enclosingType;
        private final List<? extends FieldDescription.Token> fieldTokens;
        private final List<? extends TypeDescription.Generic> interfaceTypes;
        private final LoadedTypeInitializer loadedTypeInitializer;
        private final boolean localClass;
        private final List<? extends MethodDescription.Token> methodTokens;
        private final int modifiers;
        private final String name;
        private final TypeDescription nestHost;
        private final List<? extends TypeDescription> nestMembers;
        private final TypeDescription.Generic superClass;
        private final TypeInitializer typeInitializer;
        private final List<? extends TypeVariableToken> typeVariables;

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ InstrumentedType withAnnotations(List list) {
            return withAnnotations((List<? extends AnnotationDescription>) list);
        }

        protected Default(String str, int i, TypeDescription.Generic generic, List<? extends TypeVariableToken> list, List<? extends TypeDescription.Generic> list2, List<? extends FieldDescription.Token> list3, List<? extends MethodDescription.Token> list4, List<? extends AnnotationDescription> list5, TypeInitializer typeInitializer, LoadedTypeInitializer loadedTypeInitializer, TypeDescription typeDescription, MethodDescription.InDefinedShape inDefinedShape, TypeDescription typeDescription2, List<? extends TypeDescription> list6, boolean z, boolean z2, TypeDescription typeDescription3, List<? extends TypeDescription> list7) {
            this.name = str;
            this.modifiers = i;
            this.typeVariables = list;
            this.superClass = generic;
            this.interfaceTypes = list2;
            this.fieldTokens = list3;
            this.methodTokens = list4;
            this.annotationDescriptions = list5;
            this.typeInitializer = typeInitializer;
            this.loadedTypeInitializer = loadedTypeInitializer;
            this.declaringType = typeDescription;
            this.enclosingMethod = inDefinedShape;
            this.enclosingType = typeDescription2;
            this.declaredTypes = list6;
            this.anonymousClass = z;
            this.localClass = z2;
            this.nestHost = typeDescription3;
            this.nestMembers = list7;
        }

        public static InstrumentedType of(String str, TypeDescription.Generic generic, ModifierContributor.ForType... forTypeArr) {
            return of(str, generic, ModifierContributor.Resolver.of(forTypeArr).resolve());
        }

        public static InstrumentedType of(String str, TypeDescription.Generic generic, int i) {
            return Factory.Default.MODIFIABLE.subclass(str, i, generic);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withModifiers(int i) {
            return new Default(this.name, i, this.superClass, this.typeVariables, this.interfaceTypes, this.fieldTokens, this.methodTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.anonymousClass, this.localClass, this.nestHost, this.nestMembers);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withField(FieldDescription.Token token) {
            return new Default(this.name, this.modifiers, this.superClass, this.typeVariables, this.interfaceTypes, CompoundList.of(this.fieldTokens, token.accept2((TypeDescription.Generic.Visitor<? extends TypeDescription.Generic>) TypeDescription.Generic.Visitor.Substitutor.ForDetachment.of(this))), this.methodTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.anonymousClass, this.localClass, this.nestHost, this.nestMembers);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withMethod(MethodDescription.Token token) {
            return new Default(this.name, this.modifiers, this.superClass, this.typeVariables, this.interfaceTypes, this.fieldTokens, CompoundList.of(this.methodTokens, token.accept2((TypeDescription.Generic.Visitor<? extends TypeDescription.Generic>) TypeDescription.Generic.Visitor.Substitutor.ForDetachment.of(this))), this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.anonymousClass, this.localClass, this.nestHost, this.nestMembers);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withInterfaces(TypeList.Generic generic) {
            return new Default(this.name, this.modifiers, this.superClass, this.typeVariables, CompoundList.of((List) this.interfaceTypes, (List) generic.accept(TypeDescription.Generic.Visitor.Substitutor.ForDetachment.of(this))), this.fieldTokens, this.methodTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.anonymousClass, this.localClass, this.nestHost, this.nestMembers);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withAnnotations(List<? extends AnnotationDescription> list) {
            return new Default(this.name, this.modifiers, this.superClass, this.typeVariables, this.interfaceTypes, this.fieldTokens, this.methodTokens, CompoundList.of((List) this.annotationDescriptions, (List) list), this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.anonymousClass, this.localClass, this.nestHost, this.nestMembers);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withNestHost(TypeDescription typeDescription) {
            String str = this.name;
            int i = this.modifiers;
            TypeDescription.Generic generic = this.superClass;
            List<? extends TypeVariableToken> list = this.typeVariables;
            List<? extends TypeDescription.Generic> list2 = this.interfaceTypes;
            List<? extends FieldDescription.Token> list3 = this.fieldTokens;
            List<? extends MethodDescription.Token> list4 = this.methodTokens;
            List<? extends AnnotationDescription> list5 = this.annotationDescriptions;
            TypeInitializer typeInitializer = this.typeInitializer;
            LoadedTypeInitializer loadedTypeInitializer = this.loadedTypeInitializer;
            TypeDescription typeDescription2 = this.declaringType;
            MethodDescription.InDefinedShape inDefinedShape = this.enclosingMethod;
            TypeDescription typeDescription3 = this.enclosingType;
            List<? extends TypeDescription> list6 = this.declaredTypes;
            boolean z = this.anonymousClass;
            boolean z2 = this.localClass;
            TypeDescription typeDescription4 = typeDescription;
            if (typeDescription4.equals(this)) {
                typeDescription4 = TargetType.DESCRIPTION;
            }
            return new Default(str, i, generic, list, list2, list3, list4, list5, typeInitializer, loadedTypeInitializer, typeDescription2, inDefinedShape, typeDescription3, list6, z, z2, typeDescription4, Collections.emptyList());
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withNestMembers(TypeList typeList) {
            return new Default(this.name, this.modifiers, this.superClass, this.typeVariables, this.interfaceTypes, this.fieldTokens, this.methodTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.anonymousClass, this.localClass, TargetType.DESCRIPTION, CompoundList.of((List) this.nestMembers, (List) typeList));
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withEnclosingType(TypeDescription typeDescription) {
            return new Default(this.name, this.modifiers, this.superClass, this.typeVariables, this.interfaceTypes, this.fieldTokens, this.methodTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, MethodDescription.UNDEFINED, typeDescription, this.declaredTypes, this.anonymousClass, this.localClass, this.nestHost, this.nestMembers);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withEnclosingMethod(MethodDescription.InDefinedShape inDefinedShape) {
            return new Default(this.name, this.modifiers, this.superClass, this.typeVariables, this.interfaceTypes, this.fieldTokens, this.methodTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, inDefinedShape, inDefinedShape.getDeclaringType(), this.declaredTypes, this.anonymousClass, this.localClass, this.nestHost, this.nestMembers);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withDeclaringType(TypeDescription typeDescription) {
            return new Default(this.name, this.modifiers, this.superClass, this.typeVariables, this.interfaceTypes, this.fieldTokens, this.methodTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, typeDescription, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.anonymousClass, this.localClass, this.nestHost, this.nestMembers);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withDeclaredTypes(TypeList typeList) {
            return new Default(this.name, this.modifiers, this.superClass, this.typeVariables, this.interfaceTypes, this.fieldTokens, this.methodTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, CompoundList.of((List) this.declaredTypes, (List) typeList), this.anonymousClass, this.localClass, this.nestHost, this.nestMembers);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withTypeVariable(TypeVariableToken typeVariableToken) {
            return new Default(this.name, this.modifiers, this.superClass, CompoundList.of(this.typeVariables, typeVariableToken.accept2((TypeDescription.Generic.Visitor<? extends TypeDescription.Generic>) TypeDescription.Generic.Visitor.Substitutor.ForDetachment.of(this))), this.interfaceTypes, this.fieldTokens, this.methodTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.anonymousClass, this.localClass, this.nestHost, this.nestMembers);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName
        public WithFlexibleName withName(String str) {
            return new Default(str, this.modifiers, this.superClass, this.typeVariables, this.interfaceTypes, this.fieldTokens, this.methodTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.anonymousClass, this.localClass, this.nestHost, this.nestMembers);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName
        public WithFlexibleName withTypeVariables(ElementMatcher<? super TypeDescription.Generic> elementMatcher, Transformer<TypeVariableToken> transformer) {
            ArrayList arrayList = new ArrayList(this.typeVariables.size());
            int i = 0;
            for (TypeVariableToken typeVariableToken : this.typeVariables) {
                int i2 = i + 1;
                if (elementMatcher.matches(getTypeVariables().get(i))) {
                    typeVariableToken = transformer.transform(this, typeVariableToken);
                }
                arrayList.add(typeVariableToken);
                i = i2;
            }
            return new Default(this.name, this.modifiers, this.superClass, arrayList, this.interfaceTypes, this.fieldTokens, this.methodTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.anonymousClass, this.localClass, this.nestHost, this.nestMembers);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withLocalClass(boolean z) {
            return new Default(this.name, this.modifiers, this.superClass, this.typeVariables, this.interfaceTypes, this.fieldTokens, this.methodTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, false, z, this.nestHost, this.nestMembers);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withAnonymousClass(boolean z) {
            return new Default(this.name, this.modifiers, this.superClass, this.typeVariables, this.interfaceTypes, this.fieldTokens, this.methodTokens, this.annotationDescriptions, this.typeInitializer, this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, z, false, this.nestHost, this.nestMembers);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withInitializer(LoadedTypeInitializer loadedTypeInitializer) {
            return new Default(this.name, this.modifiers, this.superClass, this.typeVariables, this.interfaceTypes, this.fieldTokens, this.methodTokens, this.annotationDescriptions, this.typeInitializer, new LoadedTypeInitializer.Compound(this.loadedTypeInitializer, loadedTypeInitializer), this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.anonymousClass, this.localClass, this.nestHost, this.nestMembers);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withInitializer(ByteCodeAppender byteCodeAppender) {
            return new Default(this.name, this.modifiers, this.superClass, this.typeVariables, this.interfaceTypes, this.fieldTokens, this.methodTokens, this.annotationDescriptions, this.typeInitializer.expandWith(byteCodeAppender), this.loadedTypeInitializer, this.declaringType, this.enclosingMethod, this.enclosingType, this.declaredTypes, this.anonymousClass, this.localClass, this.nestHost, this.nestMembers);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public LoadedTypeInitializer getLoadedTypeInitializer() {
            return this.loadedTypeInitializer;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public TypeInitializer getTypeInitializer() {
            return this.typeInitializer;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public MethodDescription.InDefinedShape getEnclosingMethod() {
            return this.enclosingMethod;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public TypeDescription getEnclosingType() {
            return this.enclosingType;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public TypeList getDeclaredTypes() {
            return new TypeList.Explicit(this.declaredTypes);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isAnonymousType() {
            return this.anonymousClass;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isLocalType() {
            return this.localClass;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public PackageDescription getPackage() {
            int lastIndexOf = this.name.lastIndexOf(46);
            return new PackageDescription.Simple(lastIndexOf == -1 ? "" : this.name.substring(0, lastIndexOf));
        }

        @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
        public AnnotationList getDeclaredAnnotations() {
            return new AnnotationList.Explicit(this.annotationDescriptions);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.DeclaredByType
        public TypeDescription getDeclaringType() {
            return this.declaringType;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public TypeDescription.Generic getSuperClass() {
            return this.superClass == null ? TypeDescription.Generic.UNDEFINED : new TypeDescription.Generic.LazyProjection.WithResolvedErasure(this.superClass, TypeDescription.Generic.Visitor.Substitutor.ForAttachment.of(this));
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public TypeList.Generic getInterfaces() {
            return new TypeList.Generic.ForDetachedTypes.WithResolvedErasure(this.interfaceTypes, TypeDescription.Generic.Visitor.Substitutor.ForAttachment.of(this));
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public FieldList<FieldDescription.InDefinedShape> getDeclaredFields() {
            return new FieldList.ForTokens(this, this.fieldTokens);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public MethodList<MethodDescription.InDefinedShape> getDeclaredMethods() {
            return new MethodList.ForTokens(this, this.methodTokens);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.TypeVariableSource
        public TypeList.Generic getTypeVariables() {
            return TypeList.Generic.ForDetachedTypes.attachVariables(this, this.typeVariables);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable
        public int getModifiers() {
            return this.modifiers;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
        public String getName() {
            return this.name;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public TypeDescription getNestHost() {
            return this.nestHost.represents(TargetType.class) ? this : this.nestHost;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public TypeList getNestMembers() {
            return new TypeList.Explicit((List<? extends TypeDescription>) CompoundList.of(this, (List<? extends Default>) this.nestMembers));
        }

        /* JADX WARN: Code restructure failed: missing block: B:82:0x0273, code lost:
        
            throw new java.lang.IllegalStateException("Illegal interface bound " + r12 + " of " + r5 + " for " + r30);
         */
        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public TypeDescription validated() {
            AnnotationDescription annotationDescription;
            boolean z;
            if (!isValidIdentifier(getName().split("\\."))) {
                throw new IllegalStateException("Illegal type name: " + getName() + " for " + this);
            }
            if ((getModifiers() & (-161312)) != 0) {
                throw new IllegalStateException("Illegal modifiers " + getModifiers() + " for " + this);
            }
            if (isPackageType() && getModifiers() != 5632) {
                throw new IllegalStateException("Illegal modifiers " + getModifiers() + " for package " + this);
            }
            TypeDescription.Generic superClass = getSuperClass();
            if (superClass != null) {
                if (!((Boolean) superClass.accept(TypeDescription.Generic.Visitor.Validator.SUPER_CLASS)).booleanValue()) {
                    throw new IllegalStateException("Illegal super class " + superClass + " for " + this);
                }
                if (!((Boolean) superClass.accept(TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.INSTANCE)).booleanValue()) {
                    throw new IllegalStateException("Illegal type annotations on super class " + superClass + " for " + this);
                }
                if (!superClass.asErasure().isVisibleTo(this)) {
                    throw new IllegalStateException("Invisible super type " + superClass + " for " + this);
                }
            }
            HashSet hashSet = new HashSet();
            for (TypeDescription.Generic generic : getInterfaces()) {
                if (!((Boolean) generic.accept(TypeDescription.Generic.Visitor.Validator.INTERFACE)).booleanValue()) {
                    throw new IllegalStateException("Illegal interface " + generic + " for " + this);
                }
                if (!((Boolean) generic.accept(TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.INSTANCE)).booleanValue()) {
                    throw new IllegalStateException("Illegal type annotations on interface " + generic + " for " + this);
                }
                if (!hashSet.add(generic.asErasure())) {
                    throw new IllegalStateException("Already implemented interface " + generic + " for " + this);
                }
                if (!generic.asErasure().isVisibleTo(this)) {
                    throw new IllegalStateException("Invisible interface type " + generic + " for " + this);
                }
            }
            TypeList.Generic typeVariables = getTypeVariables();
            if (!typeVariables.isEmpty() && isAssignableTo(Throwable.class)) {
                throw new IllegalStateException("Cannot define throwable " + this + " to be generic");
            }
            HashSet hashSet2 = new HashSet();
            Iterator it = typeVariables.iterator();
            loop1: while (true) {
                String str = "Illegal interface bound ";
                String str2 = "Duplicate bound ";
                String str3 = "Illegal type annotation on '";
                String str4 = "Illegal type variable name '";
                String str5 = "Duplicate type variable symbol '";
                String str6 = "' for ";
                if (it.hasNext()) {
                    TypeDescription.Generic generic2 = (TypeDescription.Generic) it.next();
                    Iterator it2 = it;
                    String symbol = generic2.getSymbol();
                    if (!hashSet2.add(symbol)) {
                        throw new IllegalStateException("Duplicate type variable symbol '" + generic2 + "' for " + this);
                    }
                    if (!isValidIdentifier(symbol)) {
                        throw new IllegalStateException("Illegal type variable name '" + generic2 + "' for " + this);
                    }
                    if (!TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.ofFormalTypeVariable(generic2)) {
                        throw new IllegalStateException("Illegal type annotation on '" + generic2 + "' for " + this);
                    }
                    HashSet hashSet3 = new HashSet();
                    for (TypeDescription.Generic generic3 : generic2.getUpperBounds()) {
                        if (!((Boolean) generic3.accept(TypeDescription.Generic.Visitor.Validator.TYPE_VARIABLE)).booleanValue()) {
                            throw new IllegalStateException("Illegal type variable bound " + generic3 + " of " + generic2 + " for " + this);
                        }
                        if (!((Boolean) generic3.accept(TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.INSTANCE)).booleanValue()) {
                            throw new IllegalStateException("Illegal type annotations on type variable " + generic3 + " for " + this);
                        }
                        if (!hashSet3.add(generic3)) {
                            throw new IllegalStateException("Duplicate bound " + generic3 + " of " + generic2 + " for " + this);
                        }
                        z = !z || (!generic3.getSort().isTypeVariable() && generic3.isInterface());
                    }
                    if (!z) {
                        throw new IllegalStateException("Type variable " + generic2 + " for " + this + " does not define at least one bound");
                    }
                    it = it2;
                } else {
                    TypeDescription enclosingType = getEnclosingType();
                    if (enclosingType != null && (enclosingType.isArray() || enclosingType.isPrimitive())) {
                        throw new IllegalStateException("Cannot define array type or primitive type " + enclosingType + " + as enclosing type for " + this);
                    }
                    MethodDescription.InDefinedShape enclosingMethod = getEnclosingMethod();
                    if (enclosingMethod != null && enclosingMethod.isTypeInitializer()) {
                        throw new IllegalStateException("Cannot enclose type declaration in class initializer " + enclosingMethod);
                    }
                    TypeDescription declaringType = getDeclaringType();
                    if (declaringType != null) {
                        if (declaringType.isPrimitive() || declaringType.isArray()) {
                            throw new IllegalStateException("Cannot define array type or primitive type " + declaringType + " as declaring type for " + this);
                        }
                    } else if (enclosingType == null && enclosingMethod == null && (isLocalType() || isAnonymousType())) {
                        throw new IllegalStateException("Cannot define an anonymous or local class without a declaring type for " + this);
                    }
                    HashSet hashSet4 = new HashSet();
                    Iterator it3 = getDeclaredTypes().iterator();
                    while (it3.hasNext()) {
                        Iterator it4 = it3;
                        TypeDescription typeDescription = (TypeDescription) it3.next();
                        if (typeDescription.isArray() || typeDescription.isPrimitive()) {
                            throw new IllegalStateException("Cannot define array type or primitive type " + typeDescription + " + as declared type for " + this);
                        }
                        if (!hashSet4.add(typeDescription)) {
                            throw new IllegalStateException("Duplicate definition of declared type " + typeDescription);
                        }
                        it3 = it4;
                    }
                    TypeDescription nestHost = getNestHost();
                    if (nestHost.equals(this)) {
                        HashSet hashSet5 = new HashSet();
                        Iterator it5 = getNestMembers().iterator();
                        while (it5.hasNext()) {
                            Iterator it6 = it5;
                            TypeDescription typeDescription2 = (TypeDescription) it5.next();
                            if (typeDescription2.isArray() || typeDescription2.isPrimitive()) {
                                throw new IllegalStateException("Cannot define array type or primitive type " + typeDescription2 + " + as nest member of " + this);
                            }
                            if (!typeDescription2.isSamePackage(this)) {
                                throw new IllegalStateException("Cannot define nest member " + typeDescription2 + " + within different package then " + this);
                            }
                            if (!hashSet5.add(typeDescription2)) {
                                throw new IllegalStateException("Duplicate definition of nest member " + typeDescription2);
                            }
                            it5 = it6;
                        }
                    } else {
                        if (nestHost.isArray() || nestHost.isPrimitive()) {
                            throw new IllegalStateException("Cannot define array type or primitive type " + nestHost + " + as nest host for " + this);
                        }
                        if (!nestHost.isSamePackage(this)) {
                            throw new IllegalStateException("Cannot define nest host " + nestHost + " + within different package then " + this);
                        }
                    }
                    HashSet hashSet6 = new HashSet();
                    Iterator it7 = getDeclaredAnnotations().iterator();
                    while (true) {
                        String str7 = str5;
                        String str8 = str4;
                        if (it7.hasNext()) {
                            annotationDescription = (AnnotationDescription) it7.next();
                            Iterator it8 = it7;
                            String str9 = str6;
                            if (annotationDescription.getElementTypes().contains(ElementType.TYPE) || ((isAnnotation() && annotationDescription.getElementTypes().contains(ElementType.ANNOTATION_TYPE)) || (isPackageType() && annotationDescription.getElementTypes().contains(ElementType.PACKAGE)))) {
                                if (!hashSet6.add(annotationDescription.getAnnotationType())) {
                                    throw new IllegalStateException("Duplicate annotation " + annotationDescription + " for " + this);
                                }
                                str5 = str7;
                                str4 = str8;
                                it7 = it8;
                                str6 = str9;
                            }
                        } else {
                            String str10 = str6;
                            HashSet hashSet7 = new HashSet();
                            Iterator it9 = getDeclaredFields().iterator();
                            while (true) {
                                String str11 = "Illegal type annotations on ";
                                if (it9.hasNext()) {
                                    FieldDescription.InDefinedShape inDefinedShape = (FieldDescription.InDefinedShape) it9.next();
                                    String name = inDefinedShape.getName();
                                    Iterator it10 = it9;
                                    if (!hashSet7.add(inDefinedShape.asSignatureToken())) {
                                        throw new IllegalStateException("Duplicate field definition for " + inDefinedShape);
                                    }
                                    if (!isValidIdentifier(name)) {
                                        throw new IllegalStateException("Illegal field name for " + inDefinedShape);
                                    }
                                    if ((inDefinedShape.getModifiers() & (-151776)) != 0) {
                                        throw new IllegalStateException("Illegal field modifiers " + inDefinedShape.getModifiers() + " for " + inDefinedShape);
                                    }
                                    TypeDescription.Generic type = inDefinedShape.getType();
                                    HashSet hashSet8 = hashSet7;
                                    if (!((Boolean) type.accept(TypeDescription.Generic.Visitor.Validator.FIELD)).booleanValue()) {
                                        throw new IllegalStateException("Illegal field type " + type + " for " + inDefinedShape);
                                    }
                                    if (!((Boolean) type.accept(TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.INSTANCE)).booleanValue()) {
                                        throw new IllegalStateException("Illegal type annotations on " + type + " for " + this);
                                    }
                                    if (!inDefinedShape.isSynthetic() && !type.asErasure().isVisibleTo(this)) {
                                        throw new IllegalStateException("Invisible field type " + inDefinedShape.getType() + " for " + inDefinedShape);
                                    }
                                    HashSet hashSet9 = new HashSet();
                                    Iterator it11 = inDefinedShape.getDeclaredAnnotations().iterator();
                                    while (it11.hasNext()) {
                                        AnnotationDescription annotationDescription2 = (AnnotationDescription) it11.next();
                                        Iterator it12 = it11;
                                        String str12 = str3;
                                        if (!annotationDescription2.getElementTypes().contains(ElementType.FIELD)) {
                                            throw new IllegalStateException("Cannot add " + annotationDescription2 + " on " + inDefinedShape);
                                        }
                                        if (!hashSet9.add(annotationDescription2.getAnnotationType())) {
                                            throw new IllegalStateException("Duplicate annotation " + annotationDescription2 + " for " + inDefinedShape);
                                        }
                                        it11 = it12;
                                        str3 = str12;
                                    }
                                    hashSet7 = hashSet8;
                                    it9 = it10;
                                } else {
                                    String str13 = str3;
                                    HashSet hashSet10 = new HashSet();
                                    Iterator it13 = getDeclaredMethods().iterator();
                                    while (it13.hasNext()) {
                                        MethodDescription.InDefinedShape inDefinedShape2 = (MethodDescription.InDefinedShape) it13.next();
                                        if (!hashSet10.add(inDefinedShape2.asSignatureToken())) {
                                            throw new IllegalStateException("Duplicate method signature for " + inDefinedShape2);
                                        }
                                        if ((inDefinedShape2.getModifiers() & (-7680)) != 0) {
                                            throw new IllegalStateException("Illegal modifiers " + inDefinedShape2.getModifiers() + " for " + inDefinedShape2);
                                        }
                                        HashSet hashSet11 = new HashSet();
                                        for (TypeDescription.Generic generic4 : inDefinedShape2.getTypeVariables()) {
                                            HashSet hashSet12 = hashSet10;
                                            Iterator it14 = it13;
                                            String symbol2 = generic4.getSymbol();
                                            if (!hashSet11.add(symbol2)) {
                                                throw new IllegalStateException(str7 + generic4 + str10 + inDefinedShape2);
                                            }
                                            if (!isValidIdentifier(symbol2)) {
                                                throw new IllegalStateException(str8 + generic4 + str10 + inDefinedShape2);
                                            }
                                            if (!TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.ofFormalTypeVariable(generic4)) {
                                                throw new IllegalStateException(str13 + generic4 + str10 + inDefinedShape2);
                                            }
                                            HashSet hashSet13 = new HashSet();
                                            boolean z2 = false;
                                            for (TypeDescription.Generic generic5 : generic4.getUpperBounds()) {
                                                HashSet hashSet14 = hashSet11;
                                                String str14 = str11;
                                                if (!((Boolean) generic5.accept(TypeDescription.Generic.Visitor.Validator.TYPE_VARIABLE)).booleanValue()) {
                                                    throw new IllegalStateException("Illegal type variable bound " + generic5 + " of " + generic4 + " for " + inDefinedShape2);
                                                }
                                                if (!((Boolean) generic5.accept(TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.INSTANCE)).booleanValue()) {
                                                    throw new IllegalStateException("Illegal type annotations on bound " + generic5 + " of " + generic4 + " for " + this);
                                                }
                                                if (!hashSet13.add(generic5)) {
                                                    throw new IllegalStateException(str2 + generic5 + " of " + generic4 + " for " + inDefinedShape2);
                                                }
                                                if (z2 && (generic5.getSort().isTypeVariable() || !generic5.isInterface())) {
                                                    throw new IllegalStateException(str + generic5 + " of " + generic4 + " for " + inDefinedShape2);
                                                }
                                                str11 = str14;
                                                hashSet11 = hashSet14;
                                                z2 = true;
                                            }
                                            String str15 = str11;
                                            HashSet hashSet15 = hashSet11;
                                            if (!z2) {
                                                throw new IllegalStateException("Type variable " + generic4 + " for " + inDefinedShape2 + " does not define at least one bound");
                                            }
                                            it13 = it14;
                                            hashSet10 = hashSet12;
                                            str11 = str15;
                                            hashSet11 = hashSet15;
                                        }
                                        HashSet hashSet16 = hashSet10;
                                        Iterator it15 = it13;
                                        String str16 = str11;
                                        String str17 = str8;
                                        String str18 = str10;
                                        String str19 = str13;
                                        TypeDescription.Generic returnType = inDefinedShape2.getReturnType();
                                        if (inDefinedShape2.isTypeInitializer()) {
                                            throw new IllegalStateException("Illegal explicit declaration of a type initializer by " + this);
                                        }
                                        if (inDefinedShape2.isConstructor()) {
                                            str10 = str18;
                                            if (!returnType.represents(Void.TYPE)) {
                                                throw new IllegalStateException("A constructor must return void " + inDefinedShape2);
                                            }
                                            if (!returnType.getDeclaredAnnotations().isEmpty()) {
                                                throw new IllegalStateException("The void non-type must not be annotated for " + inDefinedShape2);
                                            }
                                        } else {
                                            str10 = str18;
                                            if (!isValidIdentifier(inDefinedShape2.getInternalName())) {
                                                throw new IllegalStateException("Illegal method name " + returnType + " for " + inDefinedShape2);
                                            }
                                            if (!((Boolean) returnType.accept(TypeDescription.Generic.Visitor.Validator.METHOD_RETURN)).booleanValue()) {
                                                throw new IllegalStateException("Illegal return type " + returnType + " for " + inDefinedShape2);
                                            }
                                            if (!((Boolean) returnType.accept(TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.INSTANCE)).booleanValue()) {
                                                throw new IllegalStateException("Illegal type annotations on return type " + returnType + " for " + inDefinedShape2);
                                            }
                                            if (!inDefinedShape2.isSynthetic() && !inDefinedShape2.getReturnType().asErasure().isVisibleTo(this)) {
                                                throw new IllegalStateException("Invisible return type " + inDefinedShape2.getReturnType() + " for " + inDefinedShape2);
                                            }
                                        }
                                        HashSet hashSet17 = new HashSet();
                                        Iterator it16 = inDefinedShape2.getParameters().iterator();
                                        while (it16.hasNext()) {
                                            Iterator it17 = it16;
                                            ParameterDescription.InDefinedShape inDefinedShape3 = (ParameterDescription.InDefinedShape) it16.next();
                                            String str20 = str;
                                            TypeDescription.Generic type2 = inDefinedShape3.getType();
                                            String str21 = str19;
                                            if (!((Boolean) type2.accept(TypeDescription.Generic.Visitor.Validator.METHOD_PARAMETER)).booleanValue()) {
                                                throw new IllegalStateException("Illegal parameter type of " + inDefinedShape3 + " for " + inDefinedShape2);
                                            }
                                            if (!((Boolean) type2.accept(TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.INSTANCE)).booleanValue()) {
                                                throw new IllegalStateException("Illegal type annotations on parameter " + inDefinedShape3 + " for " + inDefinedShape2);
                                            }
                                            if (!inDefinedShape2.isSynthetic() && !type2.asErasure().isVisibleTo(this)) {
                                                throw new IllegalStateException("Invisible parameter type of " + inDefinedShape3 + " for " + inDefinedShape2);
                                            }
                                            if (inDefinedShape3.isNamed()) {
                                                String name2 = inDefinedShape3.getName();
                                                if (!hashSet17.add(name2)) {
                                                    throw new IllegalStateException("Duplicate parameter name of " + inDefinedShape3 + " for " + inDefinedShape2);
                                                }
                                                if (!isValidIdentifier(name2)) {
                                                    throw new IllegalStateException("Illegal parameter name of " + inDefinedShape3 + " for " + inDefinedShape2);
                                                }
                                            }
                                            if (inDefinedShape3.hasModifiers() && (inDefinedShape3.getModifiers() & (-36881)) != 0) {
                                                throw new IllegalStateException("Illegal modifiers of " + inDefinedShape3 + " for " + inDefinedShape2);
                                            }
                                            HashSet hashSet18 = new HashSet();
                                            Iterator it18 = inDefinedShape3.getDeclaredAnnotations().iterator();
                                            while (it18.hasNext()) {
                                                HashSet hashSet19 = hashSet17;
                                                AnnotationDescription annotationDescription3 = (AnnotationDescription) it18.next();
                                                Iterator it19 = it18;
                                                String str22 = str2;
                                                if (!annotationDescription3.getElementTypes().contains(ElementType.PARAMETER)) {
                                                    throw new IllegalStateException("Cannot add " + annotationDescription3 + " on " + inDefinedShape3);
                                                }
                                                if (!hashSet18.add(annotationDescription3.getAnnotationType())) {
                                                    throw new IllegalStateException("Duplicate annotation " + annotationDescription3 + " of " + inDefinedShape3 + " for " + inDefinedShape2);
                                                }
                                                it18 = it19;
                                                hashSet17 = hashSet19;
                                                str2 = str22;
                                            }
                                            str = str20;
                                            it16 = it17;
                                            str19 = str21;
                                        }
                                        String str23 = str;
                                        str13 = str19;
                                        String str24 = str2;
                                        for (TypeDescription.Generic generic6 : inDefinedShape2.getExceptionTypes()) {
                                            if (!((Boolean) generic6.accept(TypeDescription.Generic.Visitor.Validator.EXCEPTION)).booleanValue()) {
                                                throw new IllegalStateException("Illegal exception type " + generic6 + " for " + inDefinedShape2);
                                            }
                                            if (!((Boolean) generic6.accept(TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.INSTANCE)).booleanValue()) {
                                                throw new IllegalStateException(str16 + generic6 + " for " + inDefinedShape2);
                                            }
                                            if (!inDefinedShape2.isSynthetic() && !generic6.asErasure().isVisibleTo(this)) {
                                                throw new IllegalStateException("Invisible exception type " + generic6 + " for " + inDefinedShape2);
                                            }
                                        }
                                        HashSet hashSet20 = new HashSet();
                                        Iterator it20 = inDefinedShape2.getDeclaredAnnotations().iterator();
                                        while (it20.hasNext()) {
                                            AnnotationDescription annotationDescription4 = (AnnotationDescription) it20.next();
                                            Iterator it21 = it20;
                                            if (!annotationDescription4.getElementTypes().contains(inDefinedShape2.isMethod() ? ElementType.METHOD : ElementType.CONSTRUCTOR)) {
                                                throw new IllegalStateException("Cannot add " + annotationDescription4 + " on " + inDefinedShape2);
                                            }
                                            if (!hashSet20.add(annotationDescription4.getAnnotationType())) {
                                                throw new IllegalStateException("Duplicate annotation " + annotationDescription4 + " for " + inDefinedShape2);
                                            }
                                            it20 = it21;
                                        }
                                        AnnotationValue<?, ?> defaultValue = inDefinedShape2.getDefaultValue();
                                        if (defaultValue != null && !inDefinedShape2.isDefaultValue(defaultValue)) {
                                            throw new IllegalStateException("Illegal default value " + defaultValue + "for " + inDefinedShape2);
                                        }
                                        TypeDescription.Generic receiverType = inDefinedShape2.getReceiverType();
                                        if (receiverType != null && !((Boolean) receiverType.accept(TypeDescription.Generic.Visitor.Validator.RECEIVER)).booleanValue()) {
                                            throw new IllegalStateException("Illegal receiver type " + receiverType + " for " + inDefinedShape2);
                                        }
                                        if (inDefinedShape2.isStatic()) {
                                            if (receiverType != null) {
                                                throw new IllegalStateException("Static method " + inDefinedShape2 + " defines a non-null receiver " + receiverType);
                                            }
                                        } else {
                                            if (inDefinedShape2.isConstructor()) {
                                                if (receiverType != null) {
                                                    if (receiverType.asErasure().equals(enclosingType == null ? this : enclosingType)) {
                                                    }
                                                }
                                                throw new IllegalStateException("Constructor " + inDefinedShape2 + " defines an illegal receiver " + receiverType);
                                            }
                                            if (receiverType == null || !equals(receiverType.asErasure())) {
                                                throw new IllegalStateException("Method " + inDefinedShape2 + " defines an illegal receiver " + receiverType);
                                            }
                                        }
                                        str11 = str16;
                                        str = str23;
                                        it13 = it15;
                                        hashSet10 = hashSet16;
                                        str2 = str24;
                                        str8 = str17;
                                    }
                                    return this;
                                }
                            }
                        }
                    }
                    throw new IllegalStateException("Cannot add " + annotationDescription + " on " + this);
                }
            }
        }

        private static boolean isValidIdentifier(String[] strArr) {
            if (strArr.length == 0) {
                return false;
            }
            for (String str : strArr) {
                if (!isValidIdentifier(str)) {
                    return false;
                }
            }
            return true;
        }

        private static boolean isValidIdentifier(String str) {
            if (KEYWORDS.contains(str) || str.isEmpty() || !Character.isJavaIdentifierStart(str.charAt(0))) {
                return false;
            }
            if (str.equals(PackageDescription.PACKAGE_CLASS_NAME)) {
                return true;
            }
            for (int i = 1; i < str.length(); i++) {
                if (!Character.isJavaIdentifierPart(str.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    }

    public static class Frozen extends TypeDescription.AbstractBase.OfSimpleType implements WithFlexibleName {
        private final LoadedTypeInitializer loadedTypeInitializer;
        private final TypeDescription typeDescription;

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ InstrumentedType withAnnotations(List list) {
            return withAnnotations((List<? extends AnnotationDescription>) list);
        }

        protected Frozen(TypeDescription typeDescription, LoadedTypeInitializer loadedTypeInitializer) {
            this.typeDescription = typeDescription;
            this.loadedTypeInitializer = loadedTypeInitializer;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
        public AnnotationList getDeclaredAnnotations() {
            return this.typeDescription.getDeclaredAnnotations();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable
        public int getModifiers() {
            return this.typeDescription.getModifiers();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.TypeVariableSource
        public TypeList.Generic getTypeVariables() {
            return this.typeDescription.getTypeVariables();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
        public String getName() {
            return this.typeDescription.getName();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public TypeDescription.Generic getSuperClass() {
            return this.typeDescription.getSuperClass();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public TypeList.Generic getInterfaces() {
            return this.typeDescription.getInterfaces();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public FieldList<FieldDescription.InDefinedShape> getDeclaredFields() {
            return this.typeDescription.getDeclaredFields();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public MethodList<MethodDescription.InDefinedShape> getDeclaredMethods() {
            return this.typeDescription.getDeclaredMethods();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isAnonymousType() {
            return this.typeDescription.isAnonymousType();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isLocalType() {
            return this.typeDescription.isLocalType();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isMemberType() {
            return this.typeDescription.isMemberType();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public PackageDescription getPackage() {
            return this.typeDescription.getPackage();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public TypeDescription getEnclosingType() {
            return this.typeDescription.getEnclosingType();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.DeclaredByType
        public TypeDescription getDeclaringType() {
            return this.typeDescription.getDeclaringType();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public TypeList getDeclaredTypes() {
            return this.typeDescription.getDeclaredTypes();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public MethodDescription.InDefinedShape getEnclosingMethod() {
            return this.typeDescription.getEnclosingMethod();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.ByteCodeElement
        public String getGenericSignature() {
            return this.typeDescription.getGenericSignature();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public int getActualModifiers(boolean z) {
            return this.typeDescription.getActualModifiers(z);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public TypeDescription getNestHost() {
            return this.typeDescription.getNestHost();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public TypeList getNestMembers() {
            return this.typeDescription.getNestMembers();
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withField(FieldDescription.Token token) {
            throw new IllegalStateException("Cannot define field for frozen type: " + this.typeDescription);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withMethod(MethodDescription.Token token) {
            throw new IllegalStateException("Cannot define method for frozen type: " + this.typeDescription);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withModifiers(int i) {
            throw new IllegalStateException("Cannot change modifiers for frozen type: " + this.typeDescription);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withInterfaces(TypeList.Generic generic) {
            throw new IllegalStateException("Cannot add interfaces for frozen type: " + this.typeDescription);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withTypeVariable(TypeVariableToken typeVariableToken) {
            throw new IllegalStateException("Cannot define type variable for frozen type: " + this.typeDescription);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withAnnotations(List<? extends AnnotationDescription> list) {
            throw new IllegalStateException("Cannot add annotation to frozen type: " + this.typeDescription);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withNestHost(TypeDescription typeDescription) {
            throw new IllegalStateException("Cannot set nest host of frozen type: " + this.typeDescription);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withNestMembers(TypeList typeList) {
            throw new IllegalStateException("Cannot add nest members to frozen type: " + this.typeDescription);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withEnclosingType(TypeDescription typeDescription) {
            throw new IllegalStateException("Cannot set enclosing type of frozen type: " + this.typeDescription);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withEnclosingMethod(MethodDescription.InDefinedShape inDefinedShape) {
            throw new IllegalStateException("Cannot set enclosing method of frozen type: " + this.typeDescription);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withDeclaringType(TypeDescription typeDescription) {
            throw new IllegalStateException("Cannot add declaring type to frozen type: " + this.typeDescription);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withDeclaredTypes(TypeList typeList) {
            throw new IllegalStateException("Cannot add declared types to frozen type: " + this.typeDescription);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withLocalClass(boolean z) {
            throw new IllegalStateException("Cannot define local class state to frozen type: " + this.typeDescription);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withAnonymousClass(boolean z) {
            throw new IllegalStateException("Cannot define anonymous class state to frozen type: " + this.typeDescription);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withInitializer(LoadedTypeInitializer loadedTypeInitializer) {
            return new Frozen(this.typeDescription, new LoadedTypeInitializer.Compound(this.loadedTypeInitializer, loadedTypeInitializer));
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public WithFlexibleName withInitializer(ByteCodeAppender byteCodeAppender) {
            throw new IllegalStateException("Cannot add initializer to frozen type: " + this.typeDescription);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName
        public WithFlexibleName withName(String str) {
            throw new IllegalStateException("Cannot change name of frozen type: " + this.typeDescription);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName
        public WithFlexibleName withTypeVariables(ElementMatcher<? super TypeDescription.Generic> elementMatcher, Transformer<TypeVariableToken> transformer) {
            throw new IllegalStateException("Cannot add type variables of frozen type: " + this.typeDescription);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public LoadedTypeInitializer getLoadedTypeInitializer() {
            return this.loadedTypeInitializer;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public TypeInitializer getTypeInitializer() {
            return TypeInitializer.None.INSTANCE;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType
        public TypeDescription validated() {
            return this.typeDescription;
        }
    }
}
