package androidx.preference;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0010)\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\n\u001a\u00020\b*\u00020\u00002\u0017\u0010\t\u001a\u0013\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086\b¢\u0006\u0004\b\n\u0010\u000b\u001a8\u0010\u000e\u001a\u00020\b*\u00020\u00002\"\u0010\t\u001a\u001e\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u0007\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\b0\fH\u0086\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a(\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0010*\u00020\u0001*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0086\n¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001c\u0010\u0013\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\rH\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0016\u001a\u0014\u0010\u0017\u001a\u00020\u0003*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0014\u0010\u0019\u001a\u00020\u0003*\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0019\u0010\u0018\u001a\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001a*\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001c\u0010\u001d\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001c\u0010\u001f\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n¢\u0006\u0004\b\u001f\u0010\u001e\"\u001b\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010 *\u00020\u00008G¢\u0006\u0006\u001a\u0004\b!\u0010\"\"\u0016\u0010&\u001a\u00020\r*\u00020\u00008Ç\u0002¢\u0006\u0006\u001a\u0004\b$\u0010%"}, d2 = {"Landroidx/preference/PreferenceGroup;", "Landroidx/preference/Preference;", "preference", "", "contains", "(Landroidx/preference/PreferenceGroup;Landroidx/preference/Preference;)Z", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "", "action", "forEach", "(Landroidx/preference/PreferenceGroup;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "", "forEachIndexed", "(Landroidx/preference/PreferenceGroup;Lkotlin/jvm/functions/Function2;)V", "T", "", "key", "get", "(Landroidx/preference/PreferenceGroup;Ljava/lang/CharSequence;)Landroidx/preference/Preference;", "index", "(Landroidx/preference/PreferenceGroup;I)Landroidx/preference/Preference;", "isEmpty", "(Landroidx/preference/PreferenceGroup;)Z", "isNotEmpty", "", "iterator", "(Landroidx/preference/PreferenceGroup;)Ljava/util/Iterator;", "minusAssign", "(Landroidx/preference/PreferenceGroup;Landroidx/preference/Preference;)V", "plusAssign", "Lkotlin/sequences/Sequence;", "getChildren", "(Landroidx/preference/PreferenceGroup;)Lkotlin/sequences/Sequence;", "children", "getSize", "(Landroidx/preference/PreferenceGroup;)I", io.ktor.http.ContentDisposition.Parameters.Size}, k = 2, mv = {2, 3, 0})
/* loaded from: classes7.dex */
public final class PreferenceGroupKt {
    public static final <T extends androidx.preference.Preference> T get(androidx.preference.PreferenceGroup preferenceGroup, java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(preferenceGroup, "");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(charSequence, "");
        return (T) preferenceGroup.findPreference(charSequence);
    }

    public static final androidx.preference.Preference get(androidx.preference.PreferenceGroup preferenceGroup, int i) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(preferenceGroup, "");
        androidx.preference.Preference preference = preferenceGroup.getPreference(i);
        if (preference != null) {
            return preference;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Index: ");
        sb.append(i);
        sb.append(", Size: ");
        sb.append(preferenceGroup.getPreferenceCount());
        throw new java.lang.IndexOutOfBoundsException(sb.toString());
    }

    public static final boolean contains(androidx.preference.PreferenceGroup preferenceGroup, androidx.preference.Preference preference) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(preferenceGroup, "");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(preference, "");
        int preferenceCount = preferenceGroup.getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(preferenceGroup.getPreference(i), preference)) {
                return true;
            }
        }
        return false;
    }

    public static final void plusAssign(androidx.preference.PreferenceGroup preferenceGroup, androidx.preference.Preference preference) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(preferenceGroup, "");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(preference, "");
        preferenceGroup.addPreference(preference);
    }

    public static final void minusAssign(androidx.preference.PreferenceGroup preferenceGroup, androidx.preference.Preference preference) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(preferenceGroup, "");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(preference, "");
        preferenceGroup.removePreference(preference);
    }

    public static final int getSize(androidx.preference.PreferenceGroup preferenceGroup) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(preferenceGroup, "");
        return preferenceGroup.getPreferenceCount();
    }

    public static final void forEach(androidx.preference.PreferenceGroup preferenceGroup, kotlin.jvm.functions.Function1<? super androidx.preference.Preference, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(preferenceGroup, "");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(function1, "");
        int preferenceCount = preferenceGroup.getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            function1.invoke(get(preferenceGroup, i));
        }
    }

    public static final void forEachIndexed(androidx.preference.PreferenceGroup preferenceGroup, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super androidx.preference.Preference, kotlin.Unit> function2) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(preferenceGroup, "");
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(function2, "");
        int preferenceCount = preferenceGroup.getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            function2.invoke(java.lang.Integer.valueOf(i), get(preferenceGroup, i));
        }
    }

    public static final java.util.Iterator<androidx.preference.Preference> iterator(androidx.preference.PreferenceGroup preferenceGroup) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(preferenceGroup, "");
        return new androidx.preference.PreferenceGroupKt$iterator$1(preferenceGroup);
    }

    public static final kotlin.sequences.Sequence<androidx.preference.Preference> getChildren(final androidx.preference.PreferenceGroup preferenceGroup) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(preferenceGroup, "");
        return new kotlin.sequences.Sequence<androidx.preference.Preference>() { // from class: androidx.preference.PreferenceGroupKt$children$1
            @Override // kotlin.sequences.Sequence
            public final java.util.Iterator<androidx.preference.Preference> iterator() {
                return androidx.preference.PreferenceGroupKt.iterator(androidx.preference.PreferenceGroup.this);
            }
        };
    }

    public static final boolean isEmpty(androidx.preference.PreferenceGroup preferenceGroup) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(preferenceGroup, "");
        return preferenceGroup.getPreferenceCount() == 0;
    }

    public static final boolean isNotEmpty(androidx.preference.PreferenceGroup preferenceGroup) {
        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(preferenceGroup, "");
        return preferenceGroup.getPreferenceCount() != 0;
    }
}
