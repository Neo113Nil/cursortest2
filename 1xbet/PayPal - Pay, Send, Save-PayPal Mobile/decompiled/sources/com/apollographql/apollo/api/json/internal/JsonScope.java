package com.apollographql.apollo.api.json.internal;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010"}, d2 = {"Lcom/apollographql/apollo/api/json/internal/JsonScope;", "", "<init>", "()V", "", "stackSize", "", com.datadog.android.trace.api.DatadogTracingConstants.LogAttributes.STACK, "", "", "pathNames", "pathIndices", "", "getPath", "(I[I[Ljava/lang/String;[I)Ljava/util/List;", "EMPTY_ARRAY", com.visa.cbp.getEncExpo.warmup, "NONEMPTY_ARRAY", "EMPTY_OBJECT", "DANGLING_NAME", "NONEMPTY_OBJECT", "EMPTY_DOCUMENT", "NONEMPTY_DOCUMENT", "CLOSED"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JsonScope {
    public static final int CLOSED = 8;
    public static final int DANGLING_NAME = 4;
    public static final int EMPTY_ARRAY = 1;
    public static final int EMPTY_DOCUMENT = 6;
    public static final int EMPTY_OBJECT = 3;
    public static final com.apollographql.apollo.api.json.internal.JsonScope INSTANCE = new com.apollographql.apollo.api.json.internal.JsonScope();
    public static final int NONEMPTY_ARRAY = 2;
    public static final int NONEMPTY_DOCUMENT = 7;
    public static final int NONEMPTY_OBJECT = 5;

    private JsonScope() {
    }

    public final java.util.List<java.lang.Object> getPath(int stackSize, int[] stack, java.lang.String[] pathNames, int[] pathIndices) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stack, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pathNames, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pathIndices, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < stackSize; i++) {
            int i2 = stack[i];
            if (i2 == 1 || i2 == 2) {
                arrayList.add(java.lang.Integer.valueOf(pathIndices[i]));
            } else if ((i2 == 3 || i2 == 4 || i2 == 5) && (str = pathNames[i]) != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
