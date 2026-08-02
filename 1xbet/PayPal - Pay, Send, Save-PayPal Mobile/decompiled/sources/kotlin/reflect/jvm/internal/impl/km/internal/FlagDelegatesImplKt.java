package kotlin.reflect.jvm.internal.impl.km.internal;

/* loaded from: classes5.dex */
public final class FlagDelegatesImplKt {
    public static final <Node> kotlin.reflect.jvm.internal.impl.km.internal.EnumFlagDelegate<Node, kotlin.reflect.jvm.internal.impl.km.Visibility> visibilityDelegate(kotlin.reflect.KMutableProperty1<Node, java.lang.Integer> kMutableProperty1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kMutableProperty1, "");
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility> flagField = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.VISIBILITY;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(flagField, "");
        kotlin.enums.EnumEntries<kotlin.reflect.jvm.internal.impl.km.Visibility> entries = kotlin.reflect.jvm.internal.impl.km.Visibility.getEntries();
        kotlin.enums.EnumEntries<kotlin.reflect.jvm.internal.impl.km.Visibility> entries2 = kotlin.reflect.jvm.internal.impl.km.Visibility.getEntries();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(entries2, 10));
        java.util.Iterator<E> it = entries2.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.km.Visibility) it.next()).getFlag$kotlin_metadata());
        }
        return new kotlin.reflect.jvm.internal.impl.km.internal.EnumFlagDelegate<>(kMutableProperty1, flagField, entries, arrayList);
    }

    public static final <Node> kotlin.reflect.jvm.internal.impl.km.internal.EnumFlagDelegate<Node, kotlin.reflect.jvm.internal.impl.km.Modality> modalityDelegate(kotlin.reflect.KMutableProperty1<Node, java.lang.Integer> kMutableProperty1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kMutableProperty1, "");
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality> flagField = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.MODALITY;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(flagField, "");
        kotlin.enums.EnumEntries<kotlin.reflect.jvm.internal.impl.km.Modality> entries = kotlin.reflect.jvm.internal.impl.km.Modality.getEntries();
        kotlin.enums.EnumEntries<kotlin.reflect.jvm.internal.impl.km.Modality> entries2 = kotlin.reflect.jvm.internal.impl.km.Modality.getEntries();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(entries2, 10));
        java.util.Iterator<E> it = entries2.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.km.Modality) it.next()).getFlag$kotlin_metadata());
        }
        return new kotlin.reflect.jvm.internal.impl.km.internal.EnumFlagDelegate<>(kMutableProperty1, flagField, entries, arrayList);
    }

    public static final <Node> kotlin.reflect.jvm.internal.impl.km.internal.EnumFlagDelegate<Node, kotlin.reflect.jvm.internal.impl.km.MemberKind> memberKindDelegate(kotlin.reflect.KMutableProperty1<Node, java.lang.Integer> kMutableProperty1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kMutableProperty1, "");
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind> flagField = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.MEMBER_KIND;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(flagField, "");
        kotlin.enums.EnumEntries<kotlin.reflect.jvm.internal.impl.km.MemberKind> entries = kotlin.reflect.jvm.internal.impl.km.MemberKind.getEntries();
        kotlin.enums.EnumEntries<kotlin.reflect.jvm.internal.impl.km.MemberKind> entries2 = kotlin.reflect.jvm.internal.impl.km.MemberKind.getEntries();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(entries2, 10));
        java.util.Iterator<E> it = entries2.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.km.MemberKind) it.next()).getFlag$kotlin_metadata());
        }
        return new kotlin.reflect.jvm.internal.impl.km.internal.EnumFlagDelegate<>(kMutableProperty1, flagField, entries, arrayList);
    }

    public static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate<kotlin.reflect.jvm.internal.impl.km.KmClass> classBooleanFlag(kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl flagImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flagImpl, "");
        return new kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate<>(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$classBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj) {
                return java.lang.Integer.valueOf(((kotlin.reflect.jvm.internal.impl.km.KmClass) obj).getFlags$kotlin_metadata());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public final void set(java.lang.Object obj, java.lang.Object obj2) {
                ((kotlin.reflect.jvm.internal.impl.km.KmClass) obj).setFlags$kotlin_metadata(((java.lang.Number) obj2).intValue());
            }
        }, flagImpl);
    }

    public static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate<kotlin.reflect.jvm.internal.impl.km.KmFunction> functionBooleanFlag(kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl flagImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flagImpl, "");
        return new kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate<>(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$functionBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj) {
                return java.lang.Integer.valueOf(((kotlin.reflect.jvm.internal.impl.km.KmFunction) obj).getFlags$kotlin_metadata());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public final void set(java.lang.Object obj, java.lang.Object obj2) {
                ((kotlin.reflect.jvm.internal.impl.km.KmFunction) obj).setFlags$kotlin_metadata(((java.lang.Number) obj2).intValue());
            }
        }, flagImpl);
    }

    public static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate<kotlin.reflect.jvm.internal.impl.km.KmConstructor> constructorBooleanFlag(kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl flagImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flagImpl, "");
        return new kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate<>(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$constructorBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj) {
                return java.lang.Integer.valueOf(((kotlin.reflect.jvm.internal.impl.km.KmConstructor) obj).getFlags$kotlin_metadata());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public final void set(java.lang.Object obj, java.lang.Object obj2) {
                ((kotlin.reflect.jvm.internal.impl.km.KmConstructor) obj).setFlags$kotlin_metadata(((java.lang.Number) obj2).intValue());
            }
        }, flagImpl);
    }

    public static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate<kotlin.reflect.jvm.internal.impl.km.KmProperty> propertyBooleanFlag(kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl flagImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flagImpl, "");
        return new kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate<>(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$propertyBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj) {
                return java.lang.Integer.valueOf(((kotlin.reflect.jvm.internal.impl.km.KmProperty) obj).getFlags$kotlin_metadata());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public final void set(java.lang.Object obj, java.lang.Object obj2) {
                ((kotlin.reflect.jvm.internal.impl.km.KmProperty) obj).setFlags$kotlin_metadata(((java.lang.Number) obj2).intValue());
            }
        }, flagImpl);
    }

    public static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate<kotlin.reflect.jvm.internal.impl.km.KmPropertyAccessorAttributes> propertyAccessorBooleanFlag(kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl flagImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flagImpl, "");
        return new kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate<>(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$propertyAccessorBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj) {
                return java.lang.Integer.valueOf(((kotlin.reflect.jvm.internal.impl.km.KmPropertyAccessorAttributes) obj).getFlags$kotlin_metadata());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public final void set(java.lang.Object obj, java.lang.Object obj2) {
                ((kotlin.reflect.jvm.internal.impl.km.KmPropertyAccessorAttributes) obj).setFlags$kotlin_metadata(((java.lang.Number) obj2).intValue());
            }
        }, flagImpl);
    }

    public static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate<kotlin.reflect.jvm.internal.impl.km.KmValueParameter> valueParameterBooleanFlag(kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl flagImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flagImpl, "");
        return new kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate<>(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$valueParameterBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj) {
                return java.lang.Integer.valueOf(((kotlin.reflect.jvm.internal.impl.km.KmValueParameter) obj).getFlags$kotlin_metadata());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public final void set(java.lang.Object obj, java.lang.Object obj2) {
                ((kotlin.reflect.jvm.internal.impl.km.KmValueParameter) obj).setFlags$kotlin_metadata(((java.lang.Number) obj2).intValue());
            }
        }, flagImpl);
    }

    public static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate<kotlin.reflect.jvm.internal.impl.km.KmTypeAlias> typeAliasBooleanFlag(kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl flagImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flagImpl, "");
        return new kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate<>(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$typeAliasBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj) {
                return java.lang.Integer.valueOf(((kotlin.reflect.jvm.internal.impl.km.KmTypeAlias) obj).getFlags$kotlin_metadata());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public final void set(java.lang.Object obj, java.lang.Object obj2) {
                ((kotlin.reflect.jvm.internal.impl.km.KmTypeAlias) obj).setFlags$kotlin_metadata(((java.lang.Number) obj2).intValue());
            }
        }, flagImpl);
    }

    public static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate<kotlin.reflect.jvm.internal.impl.km.KmType> typeBooleanFlag(kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl flagImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flagImpl, "");
        return new kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate<>(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt$typeBooleanFlag$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj) {
                return java.lang.Integer.valueOf(((kotlin.reflect.jvm.internal.impl.km.KmType) obj).getFlags$kotlin_metadata());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public final void set(java.lang.Object obj, java.lang.Object obj2) {
                ((kotlin.reflect.jvm.internal.impl.km.KmType) obj).setFlags$kotlin_metadata(((java.lang.Number) obj2).intValue());
            }
        }, flagImpl);
    }
}
