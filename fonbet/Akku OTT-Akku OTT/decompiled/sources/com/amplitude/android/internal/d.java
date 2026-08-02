package com.amplitude.android.internal;

import android.app.Activity;
import com.amplitude.android.utilities.i;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes3.dex */
public final class d {

    @SourceDebugExtension({"SMAP\nViewTarget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewTarget.kt\ncom/amplitude/android/internal/ViewTargetKt$buildElementInteractedProperties$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n1#2:70\n*E\n"})
    public static final class a extends Lambda implements Function1<String, CharSequence> {
        public static final a a = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.length() <= 0) {
                return it;
            }
            StringBuilder sb = new StringBuilder();
            String valueOf = String.valueOf(it.charAt(0));
            Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            sb.append((Object) upperCase);
            String substring = it.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            sb.append(substring);
            return sb.toString();
        }
    }

    public static final Map<String, Object> a(c target, Activity activity) {
        String replace$default;
        List split$default;
        String joinToString$default;
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Pair pair = TuplesKt.to("[Amplitude] Action", "touch");
        Pair pair2 = TuplesKt.to("[Amplitude] Target Class", target.b);
        Pair pair3 = TuplesKt.to("[Amplitude] Target Resource", target.c);
        Pair pair4 = TuplesKt.to("[Amplitude] Target Tag", target.d);
        Pair pair5 = TuplesKt.to("[Amplitude] Target Text", target.e);
        replace$default = StringsKt__StringsJVMKt.replace$default(target.f, "_", " ", false, 4, (Object) null);
        split$default = StringsKt__StringsKt.split$default(replace$default, new String[]{" "}, false, 0, 6, (Object) null);
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(split$default, " ", null, null, 0, null, a.a, 30, null);
        Pair pair6 = TuplesKt.to("[Amplitude] Target Source", joinToString$default);
        Pair pair7 = TuplesKt.to("[Amplitude] Hierarchy", target.g);
        i.Companion.getClass();
        return MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, TuplesKt.to("[Amplitude] Screen Name", i.a.a(activity)));
    }
}
