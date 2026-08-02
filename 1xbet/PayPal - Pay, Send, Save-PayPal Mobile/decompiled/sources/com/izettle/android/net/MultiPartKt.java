package com.izettle.android.net;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MultiPartKt {
    public static final /* synthetic */ com.izettle.android.net.FormDataFieldPart access$formDataFieldPart(kotlin.jvm.functions.Function1 function1) {
        com.izettle.android.net.FormDataFieldPart.Builder builder = new com.izettle.android.net.FormDataFieldPart.Builder();
        function1.invoke(builder);
        return builder.build();
    }

    public static final /* synthetic */ com.izettle.android.net.FormDataFilePart access$formDataFilePart(kotlin.jvm.functions.Function1 function1) {
        com.izettle.android.net.FormDataFilePart.Builder builder = new com.izettle.android.net.FormDataFilePart.Builder();
        function1.invoke(builder);
        return builder.build();
    }

    public static final /* synthetic */ com.izettle.android.net.RelatedFilePart access$relatedFilePart(kotlin.jvm.functions.Function1 function1) {
        com.izettle.android.net.RelatedFilePart.Builder builder = new com.izettle.android.net.RelatedFilePart.Builder();
        function1.invoke(builder);
        return builder.build();
    }

    public static final /* synthetic */ com.izettle.android.net.RelatedPart access$relatedPart(kotlin.jvm.functions.Function1 function1) {
        com.izettle.android.net.RelatedPart.Builder builder = new com.izettle.android.net.RelatedPart.Builder();
        function1.invoke(builder);
        return builder.build();
    }

    public static final /* synthetic */ void access$useOutputStreamWithPrintWriter(kotlin.jvm.functions.Function1 function1) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
            function1.invoke(kotlin.TuplesKt.to(byteArrayOutputStream2, new java.io.PrintWriter(new java.io.OutputStreamWriter(byteArrayOutputStream2, kotlin.text.Charsets.UTF_8))));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.io.CloseableKt.closeFinally(byteArrayOutputStream, null);
        } finally {
        }
    }
}
