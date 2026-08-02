package org.modelmapper.internal.bytebuddy.implementation.auxiliary;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.modelmapper.internal.bytebuddy.ByteBuddy;
import org.modelmapper.internal.bytebuddy.ClassFileVersion;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationDescription;
import org.modelmapper.internal.bytebuddy.dynamic.DynamicType;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeValidation;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy;
import org.modelmapper.internal.bytebuddy.implementation.MethodAccessorFactory;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.AuxiliaryType;

/* loaded from: classes4.dex */
public enum TrivialType implements AuxiliaryType {
    SIGNATURE_RELEVANT(true),
    PLAIN(false);

    private final boolean eager;

    TrivialType(boolean z) {
        this.eager = z;
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.auxiliary.AuxiliaryType
    public DynamicType make(String str, ClassFileVersion classFileVersion, MethodAccessorFactory methodAccessorFactory) {
        List emptyList;
        DynamicType.Builder subclass = new ByteBuddy(classFileVersion).with(TypeValidation.DISABLED).with(MethodGraph.Empty.INSTANCE).subclass(Object.class, (ConstructorStrategy) ConstructorStrategy.Default.NO_CONSTRUCTORS);
        if (this.eager) {
            emptyList = Collections.singletonList(AnnotationDescription.Builder.ofType((Class<? extends Annotation>) AuxiliaryType.SignatureRelevant.class).build());
        } else {
            emptyList = Collections.emptyList();
        }
        return subclass.annotateType((Collection<? extends AnnotationDescription>) emptyList).name(str).modifiers(DEFAULT_TYPE_MODIFIER).make();
    }
}
