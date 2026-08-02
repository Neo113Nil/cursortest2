package net.idrnd.face.iad.capture.internal;

/* loaded from: classes17.dex */
public abstract class r {
    public static java.lang.String a() {
        return net.idrnd.face.iad.capture.internal.s.f7002a;
    }

    public static java.lang.String[] b() {
        java.lang.String[] strArr;
        java.util.List emptyList;
        strArr = net.idrnd.face.iad.capture.internal.s.d;
        java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Arrays.asList(java.util.Arrays.copyOf(strArr, strArr.length)));
        java.lang.String str = java.lang.System.getenv("PATH");
        if (str == null || kotlin.jvm.internal.Intrinsics.areEqual("", str)) {
            return (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        }
        java.util.List<java.lang.String> split = new kotlin.text.Regex(io.ktor.sse.ServerSentEventKt.COLON).split(str, 0);
        if (!split.isEmpty()) {
            java.util.ListIterator<java.lang.String> listIterator = split.listIterator(split.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() != 0) {
                    emptyList = kotlin.collections.CollectionsKt.take(split, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        emptyList = kotlin.collections.CollectionsKt.emptyList();
        java.lang.String[] strArr2 = (java.lang.String[]) emptyList.toArray(new java.lang.String[0]);
        int length = strArr2.length;
        for (int i = 0; i < length; i++) {
            java.lang.String str2 = strArr2[i];
            if (!kotlin.text.StringsKt.endsWith$default(str2, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, false, 2, (java.lang.Object) null)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str2);
                sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
                str2 = sb.toString();
            }
            if (!arrayList.contains(str2)) {
                arrayList.add(str2);
            }
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }
}
