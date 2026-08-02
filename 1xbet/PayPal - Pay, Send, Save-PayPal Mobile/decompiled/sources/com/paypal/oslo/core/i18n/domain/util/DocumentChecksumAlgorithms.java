package com.paypal.oslo.core.i18n.domain.util;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/util/DocumentChecksumAlgorithms;", "", "<init>", "()V", "", "documentId", "", "validateCNPJ", "(Ljava/lang/String;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DocumentChecksumAlgorithms {
    public static final com.paypal.oslo.core.i18n.domain.util.DocumentChecksumAlgorithms INSTANCE = new com.paypal.oslo.core.i18n.domain.util.DocumentChecksumAlgorithms();

    private DocumentChecksumAlgorithms() {
    }

    public final boolean validateCNPJ(java.lang.String documentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentId, "");
        java.lang.String str = documentId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (java.lang.Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        java.lang.String obj = sb.toString();
        if (obj.length() != 14) {
            return false;
        }
        java.lang.String substring = obj.substring(0, 12);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        java.lang.String str2 = substring;
        java.util.ArrayList arrayList = new java.util.ArrayList(str2.length());
        for (int i2 = 0; i2 < str2.length(); i2++) {
            arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(java.lang.String.valueOf(str2.charAt(i2)))));
        }
        java.util.ArrayList arrayList2 = arrayList;
        int parseInt = java.lang.Integer.parseInt(java.lang.String.valueOf(obj.charAt(12)));
        int parseInt2 = java.lang.Integer.parseInt(java.lang.String.valueOf(obj.charAt(13)));
        int i3 = 0;
        for (kotlin.Pair pair : kotlin.collections.CollectionsKt.zip(arrayList2, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2}))) {
            i3 += ((java.lang.Number) pair.component1()).intValue() * ((java.lang.Number) pair.component2()).intValue();
        }
        int i4 = i3 % 11;
        int i5 = i4 < 2 ? 0 : 11 - i4;
        int i6 = 0;
        for (kotlin.Pair pair2 : kotlin.collections.CollectionsKt.zip(kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends java.lang.Integer>) arrayList2, java.lang.Integer.valueOf(i5)), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2}))) {
            i6 += ((java.lang.Number) pair2.component1()).intValue() * ((java.lang.Number) pair2.component2()).intValue();
        }
        int i7 = i6 % 11;
        return i5 == parseInt && (i7 < 2 ? 0 : 11 - i7) == parseInt2;
    }
}
