package com.amplitude.core.utilities;

import java.io.File;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

@SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 EventsFileManager.kt\ncom/amplitude/core/utilities/EventsFileManager\n*L\n1#1,328:1\n111#2,10:329\n*E\n"})
/* loaded from: classes3.dex */
public final class k<T> implements Comparator {
    public final /* synthetic */ h a;

    public k(h hVar) {
        this.a = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        String replace$default;
        int indexOf$default;
        String padStart;
        String replace$default2;
        int indexOf$default2;
        String padStart2;
        String padStart3;
        String padStart4;
        File file = (File) t;
        Intrinsics.checkNotNull(file);
        String nameWithoutExtension = FilesKt.getNameWithoutExtension(file);
        StringBuilder sb = new StringBuilder();
        h hVar = this.a;
        sb.append(hVar.b);
        sb.append('-');
        replace$default = StringsKt__StringsJVMKt.replace$default(nameWithoutExtension, sb.toString(), "", false, 4, (Object) null);
        indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) replace$default, '-', 0, false, 6, (Object) null);
        if (indexOf$default >= 0) {
            StringBuilder sb2 = new StringBuilder();
            String substring = replace$default.substring(0, indexOf$default);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            padStart4 = StringsKt__StringsKt.padStart(substring, 10, '0');
            sb2.append(padStart4);
            String substring2 = replace$default.substring(indexOf$default);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            sb2.append(substring2);
            padStart = sb2.toString();
        } else {
            padStart = StringsKt__StringsKt.padStart(replace$default, 10, '0');
        }
        File file2 = (File) t2;
        Intrinsics.checkNotNull(file2);
        replace$default2 = StringsKt__StringsJVMKt.replace$default(FilesKt.getNameWithoutExtension(file2), hVar.b + '-', "", false, 4, (Object) null);
        indexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) replace$default2, '-', 0, false, 6, (Object) null);
        if (indexOf$default2 >= 0) {
            StringBuilder sb3 = new StringBuilder();
            String substring3 = replace$default2.substring(0, indexOf$default2);
            Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
            padStart3 = StringsKt__StringsKt.padStart(substring3, 10, '0');
            sb3.append(padStart3);
            String substring4 = replace$default2.substring(indexOf$default2);
            Intrinsics.checkNotNullExpressionValue(substring4, "substring(...)");
            sb3.append(substring4);
            padStart2 = sb3.toString();
        } else {
            padStart2 = StringsKt__StringsKt.padStart(replace$default2, 10, '0');
        }
        return ComparisonsKt.compareValues(padStart, padStart2);
    }
}
