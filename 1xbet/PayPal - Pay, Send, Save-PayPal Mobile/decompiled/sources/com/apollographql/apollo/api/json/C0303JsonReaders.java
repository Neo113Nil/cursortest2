package com.apollographql.apollo.api.json;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/apollographql/apollo/api/json/JsonReader;", "", "readTypename", "(Lcom/apollographql/apollo/api/json/JsonReader;)Ljava/lang/String;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.apollographql.apollo.api.json.JsonReaders, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C0303JsonReaders {
    public static final java.lang.String readTypename(com.apollographql.apollo.api.json.JsonReader jsonReader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonReader, "");
        if (jsonReader.selectName(kotlin.collections.CollectionsKt.listOf("__typename")) != 0) {
            throw new java.lang.IllegalStateException("__typename not found".toString());
        }
        java.lang.String nextString = jsonReader.nextString();
        if (nextString != null) {
            return nextString;
        }
        throw new java.lang.IllegalStateException("__typename is null".toString());
    }
}
