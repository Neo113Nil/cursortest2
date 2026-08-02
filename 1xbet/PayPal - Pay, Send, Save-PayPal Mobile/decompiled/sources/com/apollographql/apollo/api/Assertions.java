package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"com/apollographql/apollo/api/Assertions__AssertionsKt", "com/apollographql/apollo/api/Assertions__Assertions_jvmKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Assertions {
    public static final void assertOneOf(com.apollographql.apollo.api.Optional<?>... optionalArr) {
        com.apollographql.apollo.api.Assertions__AssertionsKt.assertOneOf(optionalArr);
    }

    @java.lang.SafeVarargs
    public static final void assertOneOf(java.util.Optional<? extends java.util.Optional<?>>... optionalArr) {
        com.apollographql.apollo.api.Assertions__Assertions_jvmKt.assertOneOf(optionalArr);
    }

    public static final void checkFieldNotMissing(java.lang.Object obj, java.lang.String str) {
        com.apollographql.apollo.api.Assertions__AssertionsKt.checkFieldNotMissing(obj, str);
    }

    public static final java.lang.Void missingField(com.apollographql.apollo.api.json.JsonReader jsonReader, java.lang.String str) {
        return com.apollographql.apollo.api.Assertions__AssertionsKt.missingField(jsonReader, str);
    }
}
