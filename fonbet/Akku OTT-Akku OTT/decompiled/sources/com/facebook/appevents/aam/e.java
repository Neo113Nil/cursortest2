package com.facebook.appevents.aam;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import androidx.annotation.UiThread;
import androidx.media3.exoplayer.drm.k;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.appevents.internal.g;
import com.facebook.appevents.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes3.dex */
public final class e implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public static final a Companion = new a();
    public static final HashMap e = new HashMap();
    public final WeakReference<Activity> c;
    public final LinkedHashSet a = new LinkedHashSet();
    public final Handler b = new Handler(Looper.getMainLooper());
    public final AtomicBoolean d = new AtomicBoolean(false);

    @SourceDebugExtension({"SMAP\nMetadataViewObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MetadataViewObserver.kt\ncom/facebook/appevents/aam/MetadataViewObserver$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,165:1\n361#2,7:166\n37#3,2:173\n*S KotlinDebug\n*F\n+ 1 MetadataViewObserver.kt\ncom/facebook/appevents/aam/MetadataViewObserver$Companion\n*L\n126#1:166,7\n157#1:173,2\n*E\n"})
    public static final class a {
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
        
            r4 = new kotlin.text.Regex("[^a-z]+").replace(r4, "");
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
        
            if (r3.equals("r4") == false) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
        
            if (r3.equals("r5") == false) goto L30;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void a(a aVar, HashMap hashMap, String str, String str2) {
            boolean startsWith$default;
            boolean startsWith$default2;
            boolean startsWith$default3;
            boolean contains$default;
            aVar.getClass();
            switch (str.hashCode()) {
                case 3585:
                    if (str.equals("r3")) {
                        String str3 = CmcdData.OBJECT_TYPE_MANIFEST;
                        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str2, CmcdData.OBJECT_TYPE_MANIFEST, false, 2, null);
                        if (!startsWith$default) {
                            startsWith$default2 = StringsKt__StringsJVMKt.startsWith$default(str2, "b", false, 2, null);
                            if (!startsWith$default2) {
                                startsWith$default3 = StringsKt__StringsJVMKt.startsWith$default(str2, "ge", false, 2, null);
                                if (!startsWith$default3) {
                                    str3 = "f";
                                }
                            }
                        }
                        str2 = str3;
                        break;
                    }
                    break;
                case 3588:
                    if (str.equals("r6")) {
                        contains$default = StringsKt__StringsKt.contains$default(str2, "-", false, 2, (Object) null);
                        if (contains$default) {
                            str2 = ((String[]) new Regex("-").split(str2, 0).toArray(new String[0]))[0];
                            break;
                        }
                    }
                    break;
            }
            hashMap.put(str, str2);
        }

        @JvmStatic
        @UiThread
        public static void b(Activity activity) {
            View a;
            Intrinsics.checkNotNullParameter(activity, "activity");
            int hashCode = activity.hashCode();
            HashMap hashMap = null;
            if (!com.facebook.internal.instrument.crashshield.a.b(e.class)) {
                try {
                    hashMap = e.e;
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, e.class);
                }
            }
            Integer valueOf = Integer.valueOf(hashCode);
            Object obj = hashMap.get(valueOf);
            if (obj == null) {
                obj = new e(activity);
                hashMap.put(valueOf, obj);
            }
            e eVar = (e) obj;
            if (com.facebook.internal.instrument.crashshield.a.b(e.class)) {
                return;
            }
            try {
                if (com.facebook.internal.instrument.crashshield.a.b(eVar)) {
                    return;
                }
                try {
                    if (!eVar.d.getAndSet(true) && (a = g.a(eVar.c.get())) != null) {
                        ViewTreeObserver viewTreeObserver = a.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.addOnGlobalFocusChangeListener(eVar);
                        }
                    }
                } catch (Throwable th2) {
                    com.facebook.internal.instrument.crashshield.a.a(th2, eVar);
                }
            } catch (Throwable th3) {
                com.facebook.internal.instrument.crashshield.a.a(th3, e.class);
            }
        }
    }

    public e(Activity activity) {
        this.c = new WeakReference<>(activity);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002e -> B:6:0x0031). Please report as a decompilation issue!!! */
    public final void a(View view) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            k kVar = new k(1, view, this);
            if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
                try {
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        kVar.run();
                    } else {
                        this.b.post(kVar);
                    }
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, this);
                }
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.a.a(th2, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6 A[Catch: all -> 0x0102, TRY_LEAVE, TryCatch #1 {all -> 0x0102, blocks: (B:4:0x000a, B:9:0x0034, B:11:0x003a, B:15:0x0044, B:16:0x0064, B:18:0x006a, B:20:0x0081, B:21:0x0090, B:24:0x00a0, B:26:0x00a6, B:29:0x00b6, B:72:0x00d6, B:77:0x00b2, B:34:0x00dc, B:37:0x00f1, B:58:0x00f7, B:41:0x0106, B:42:0x010a, B:45:0x011f, B:48:0x0125, B:56:0x011b, B:64:0x00ed, B:83:0x009c, B:86:0x0130, B:74:0x00ae, B:69:0x00c0, B:53:0x0112, B:80:0x0098, B:61:0x00e4), top: B:3:0x000a, inners: #0, #2, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view) {
        CharSequence trim;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        String rule;
        boolean z;
        LinkedHashSet linkedHashSet = this.a;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.EditText");
            trim = StringsKt__StringsKt.trim((CharSequence) ((EditText) view).getText().toString());
            String lowerCase = trim.toString().toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
            if (lowerCase.length() != 0 && !linkedHashSet.contains(lowerCase) && lowerCase.length() <= 100) {
                linkedHashSet.add(lowerCase);
                HashMap hashMap = new HashMap();
                ArrayList b = c.b(view);
                d.Companion.getClass();
                Iterator it = new HashSet(d.a()).iterator();
                ArrayList arrayList3 = null;
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    a aVar = Companion;
                    String b2 = dVar.b();
                    aVar.getClass();
                    String text = Intrinsics.areEqual("r2", b2) ? new Regex("[^\\d.]").replace(lowerCase, "") : lowerCase;
                    if (!com.facebook.internal.instrument.crashshield.a.b(dVar)) {
                        try {
                            str = dVar.b;
                        } catch (Throwable th) {
                            com.facebook.internal.instrument.crashshield.a.a(th, dVar);
                        }
                        if (str.length() > 0) {
                            if (!com.facebook.internal.instrument.crashshield.a.b(dVar)) {
                                try {
                                    rule = dVar.b;
                                } catch (Throwable th2) {
                                    com.facebook.internal.instrument.crashshield.a.a(th2, dVar);
                                }
                                z = false;
                                if (!com.facebook.internal.instrument.crashshield.a.b(c.class)) {
                                    try {
                                        Intrinsics.checkNotNullParameter(text, "text");
                                        Intrinsics.checkNotNullParameter(rule, "rule");
                                        z = new Regex(rule).matches(text);
                                    } catch (Throwable th3) {
                                        com.facebook.internal.instrument.crashshield.a.a(th3, c.class);
                                    }
                                }
                                if (z) {
                                }
                            }
                            rule = null;
                            z = false;
                            if (!com.facebook.internal.instrument.crashshield.a.b(c.class)) {
                            }
                            if (z) {
                            }
                        }
                        if (!com.facebook.internal.instrument.crashshield.a.b(dVar)) {
                            try {
                                arrayList = new ArrayList(dVar.c);
                            } catch (Throwable th4) {
                                com.facebook.internal.instrument.crashshield.a.a(th4, dVar);
                            }
                            if (c.d(b, arrayList)) {
                                a.a(Companion, hashMap, dVar.b(), text);
                            } else {
                                if (arrayList3 == null) {
                                    arrayList3 = c.a(view);
                                }
                                if (!com.facebook.internal.instrument.crashshield.a.b(dVar)) {
                                    try {
                                        arrayList2 = new ArrayList(dVar.c);
                                    } catch (Throwable th5) {
                                        com.facebook.internal.instrument.crashshield.a.a(th5, dVar);
                                    }
                                    if (!c.d(arrayList3, arrayList2)) {
                                        a.a(Companion, hashMap, dVar.b(), text);
                                    }
                                }
                                arrayList2 = null;
                                if (!c.d(arrayList3, arrayList2)) {
                                }
                            }
                        }
                        arrayList = null;
                        if (c.d(b, arrayList)) {
                        }
                    }
                    str = null;
                    if (str.length() > 0) {
                    }
                    if (!com.facebook.internal.instrument.crashshield.a.b(dVar)) {
                    }
                    arrayList = null;
                    if (c.d(b, arrayList)) {
                    }
                }
                z.Companion.getClass();
                z.a.b(hashMap);
            }
        } catch (Throwable th6) {
            com.facebook.internal.instrument.crashshield.a.a(th6, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        if (view != null) {
            try {
                a(view);
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, this);
                return;
            }
        }
        if (view2 != null) {
            a(view2);
        }
    }
}
