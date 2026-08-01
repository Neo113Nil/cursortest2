package com.inmobi.media;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Debug;
import com.inmobi.media.core.config.models.SignalsConfig;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* renamed from: com.inmobi.media.y7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4235y7 {
    public static volatile SignalsConfig.FraudSignals c;
    public static final C3584b2 d;
    public static final C3584b2 e;
    public static final C3584b2 f;
    public static final C3584b2 g;
    public static final C3584b2 h;
    public static final /* synthetic */ KProperty[] b = {Reflection.property1(new PropertyReference1Impl(C4235y7.class, "jailBrokenCache", "getJailBrokenCache()Z", 0)), Reflection.property1(new PropertyReference1Impl(C4235y7.class, "debuggerAttachedCache", "getDebuggerAttachedCache()Z", 0)), Reflection.property1(new PropertyReference1Impl(C4235y7.class, "hookedCache", "getHookedCache()Z", 0)), Reflection.property1(new PropertyReference1Impl(C4235y7.class, "installTimeCache", "getInstallTimeCache()J", 0)), Reflection.property1(new PropertyReference1Impl(C4235y7.class, "installerPackageCache", "getInstallerPackageCache()Ljava/lang/String;", 0))};

    /* renamed from: a, reason: collision with root package name */
    public static final C4235y7 f7495a = new C4235y7();

    static {
        Boolean bool = Boolean.FALSE;
        d = new C3584b2(bool, new Function0() { // from class: com.inmobi.media.y7$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C4235y7.f());
            }
        }, 12);
        e = new C3584b2(bool, new Function0() { // from class: com.inmobi.media.y7$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C4235y7.a());
            }
        }, 12);
        f = new C3584b2(bool, new Function0() { // from class: com.inmobi.media.y7$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(C4235y7.c());
            }
        }, 12);
        g = new C3584b2(0L, new Function0() { // from class: com.inmobi.media.y7$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(C4235y7.d());
            }
        }, 12);
        h = new C3584b2(null, new Function0() { // from class: com.inmobi.media.y7$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4235y7.e();
            }
        }, 12);
    }

    public static final boolean a() {
        Context context;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        C4235y7 c4235y7 = f7495a;
        SignalsConfig.FraudSignals fraudSignals = c;
        if (fraudSignals == null) {
            c4235y7.getClass();
            fraudSignals = b();
        } else {
            c4235y7.getClass();
        }
        if (!fraudSignals.getDebuggerAttachedEnabled() || (context = AbstractC3914mk.f7252a) == null || (packageManager = context.getPackageManager()) == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null) {
            return false;
        }
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger() || (applicationInfo.flags & 2) != 0;
    }

    public static SignalsConfig.FraudSignals b() {
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        return ((SignalsConfig) AbstractC4260z4.f7518a.a(SignalsConfig.class)).getFraud();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (com.inmobi.media.AbstractC4208x7.b(r1.getProcStatusPath()) == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean c() {
        Object m8079constructorimpl;
        C4235y7 c4235y7 = f7495a;
        SignalsConfig.FraudSignals config = c;
        if (config == null) {
            c4235y7.getClass();
            config = b();
        } else {
            c4235y7.getClass();
        }
        boolean z = false;
        if (!config.getHookEnabled()) {
            return false;
        }
        Intrinsics.checkNotNullParameter(config, "config");
        try {
            Result.Companion companion = Result.INSTANCE;
            List<String> hookClasses = config.getHookClasses();
            if (!(hookClasses instanceof Collection) || !hookClasses.isEmpty()) {
                Iterator<T> it = hookClasses.iterator();
                while (it.hasNext()) {
                    try {
                        Class.forName((String) it.next(), false, AbstractC4208x7.class.getClassLoader());
                        break;
                    } catch (ClassNotFoundException unused) {
                    } catch (Throwable unused2) {
                    }
                }
            }
            if (!AbstractC4208x7.a(config.getProcMapsPath(), config.getHookLibs())) {
            }
            z = true;
            m8079constructorimpl = Result.m8079constructorimpl(Boolean.valueOf(z));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m8085isFailureimpl(m8079constructorimpl)) {
            m8079constructorimpl = bool;
        }
        return ((Boolean) m8079constructorimpl).booleanValue();
    }

    public static final long d() {
        Context context;
        PackageManager packageManager;
        String str;
        C4235y7 c4235y7 = f7495a;
        SignalsConfig.FraudSignals fraudSignals = c;
        if (fraudSignals == null) {
            c4235y7.getClass();
            fraudSignals = b();
        } else {
            c4235y7.getClass();
        }
        if (!fraudSignals.getAppInstallTimeEnabled() || (context = AbstractC3914mk.f7252a) == null || (packageManager = context.getPackageManager()) == null || (str = U1.f6882a) == null) {
            return 0L;
        }
        return AbstractC4208x7.a(packageManager, str);
    }

    public static final String e() {
        Context context;
        PackageManager packageManager;
        String str;
        C4235y7 c4235y7 = f7495a;
        SignalsConfig.FraudSignals fraudSignals = c;
        if (fraudSignals == null) {
            c4235y7.getClass();
            fraudSignals = b();
        } else {
            c4235y7.getClass();
        }
        if (!fraudSignals.getInstallSourceEnabled() || (context = AbstractC3914mk.f7252a) == null || (packageManager = context.getPackageManager()) == null || (str = U1.f6882a) == null) {
            return null;
        }
        return AbstractC4208x7.b(packageManager, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[LOOP:1: B:56:0x008a->B:69:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[LOOP:2: B:75:0x0054->B:88:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean f() {
        Context context;
        PackageManager pm;
        Object m8079constructorimpl;
        String str;
        boolean z;
        boolean z2;
        C4235y7 c4235y7 = f7495a;
        SignalsConfig.FraudSignals config = c;
        if (config == null) {
            c4235y7.getClass();
            config = b();
        } else {
            c4235y7.getClass();
        }
        boolean z3 = false;
        if (!config.getJailBrokenEnabled() || (context = AbstractC3914mk.f7252a) == null || (pm = context.getPackageManager()) == null) {
            return false;
        }
        Intrinsics.checkNotNullParameter(pm, "pm");
        Intrinsics.checkNotNullParameter(config, "config");
        try {
            Result.Companion companion = Result.INSTANCE;
            str = Build.TAGS;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        if (str != null && StringsKt.contains$default((CharSequence) str, (CharSequence) "test-keys", false, 2, (Object) null)) {
            return true;
        }
        List<String> suPaths = config.getSuPaths();
        if (!(suPaths instanceof Collection) || !suPaths.isEmpty()) {
            for (String str2 : suPaths) {
                if (str2 != null && !StringsKt.isBlank(str2)) {
                    try {
                        z = new File(str2).exists();
                    } catch (Throwable unused) {
                    }
                    if (!z) {
                        return true;
                    }
                }
                z = false;
                if (!z) {
                }
            }
        }
        List<String> magiskPaths = config.getMagiskPaths();
        if (!(magiskPaths instanceof Collection) || !magiskPaths.isEmpty()) {
            for (String str3 : magiskPaths) {
                if (str3 != null && !StringsKt.isBlank(str3)) {
                    try {
                        z2 = new File(str3).exists();
                    } catch (Throwable unused2) {
                    }
                    if (!z2) {
                        return true;
                    }
                }
                z2 = false;
                if (!z2) {
                }
            }
        }
        if (AbstractC4208x7.a(config.getSelinuxEnforcePath())) {
            return true;
        }
        List<String> rootPackages = config.getRootPackages();
        if (!(rootPackages instanceof Collection) || !rootPackages.isEmpty()) {
            Iterator<T> it = rootPackages.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                try {
                    pm.getPackageInfo((String) it.next(), 0);
                    z3 = true;
                    break;
                } catch (Exception unused3) {
                }
            }
        }
        m8079constructorimpl = Result.m8079constructorimpl(Boolean.valueOf(z3));
        Boolean bool = Boolean.FALSE;
        if (Result.m8085isFailureimpl(m8079constructorimpl)) {
            m8079constructorimpl = bool;
        }
        return ((Boolean) m8079constructorimpl).booleanValue();
    }
}
