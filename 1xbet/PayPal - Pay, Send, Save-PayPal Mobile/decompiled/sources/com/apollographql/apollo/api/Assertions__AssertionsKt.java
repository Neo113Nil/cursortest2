package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\t\u001a\u00020\u00042\u001a\u0010\u0001\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\b0\u0007\"\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"", "p0", "", "p1", "", "checkFieldNotMissing", "(Ljava/lang/Object;Ljava/lang/String;)V", "", "Lcom/apollographql/apollo/api/Optional;", "assertOneOf", "([Lcom/apollographql/apollo/api/Optional;)V", "Lcom/apollographql/apollo/api/json/JsonReader;", "", "missingField", "(Lcom/apollographql/apollo/api/json/JsonReader;Ljava/lang/String;)Ljava/lang/Void;"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "com/apollographql/apollo/api/Assertions")
/* loaded from: classes3.dex */
final /* synthetic */ class Assertions__AssertionsKt {
    public static final void checkFieldNotMissing(java.lang.Object obj, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (obj != null) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Field '");
        sb.append(str);
        sb.append("' is missing or null");
        throw new com.apollographql.apollo.exception.NullOrMissingField(sb.toString());
    }

    public static final java.lang.Void missingField(com.apollographql.apollo.api.json.JsonReader jsonReader, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonReader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Field '");
        sb.append(str);
        sb.append("' is missing or null at path ");
        sb.append(jsonReader.getPath());
        throw new com.apollographql.apollo.exception.NullOrMissingField(sb.toString());
    }

    public static final void assertOneOf(com.apollographql.apollo.api.Optional<?>... optionalArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optionalArr, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.apollographql.apollo.api.Optional<?> optional : optionalArr) {
            if (optional instanceof com.apollographql.apollo.api.Optional.Present) {
                arrayList.add(optional);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (arrayList2.size() != 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("@oneOf input must have one field set (got ");
            sb.append(arrayList2.size());
            sb.append(')');
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        com.apollographql.apollo.api.Optional.Present present = (com.apollographql.apollo.api.Optional.Present) kotlin.collections.CollectionsKt.first((java.util.List) arrayList2);
        if (present.getValue() == null || kotlin.jvm.internal.Intrinsics.areEqual(present.getValue(), com.apollographql.apollo.api.Optional.Absent.INSTANCE)) {
            throw new java.lang.IllegalArgumentException("The value set on @oneOf input field must be non-null");
        }
    }
}
