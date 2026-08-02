package com.facebook.appevents;

import android.content.Context;
import androidx.annotation.RestrictTo;
import com.facebook.appevents.p;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class z {
    public static final a Companion = new a();
    public final p a;

    public static final class a {
        @JvmStatic
        public static ScheduledThreadPoolExecutor a() {
            p.Companion.getClass();
            if (p.b() == null) {
                p.a.e();
            }
            ScheduledThreadPoolExecutor b = p.b();
            if (b != null) {
                return b;
            }
            throw new IllegalStateException("Required value was null.");
        }

        @JvmStatic
        @RestrictTo({RestrictTo.Scope.GROUP_ID})
        public static void b(HashMap ud) {
            String[] strArr;
            List<String> split;
            Intrinsics.checkNotNullParameter(ud, "ud");
            ConcurrentHashMap<String, String> concurrentHashMap = H.e;
            H h = H.a;
            if (com.facebook.internal.instrument.crashshield.a.b(H.class)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(ud, "ud");
                if (!H.c.get()) {
                    h.b();
                }
                for (Map.Entry entry : ud.entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    int length = str2.length() - 1;
                    int i = 0;
                    boolean z = false;
                    while (i <= length) {
                        boolean z2 = Intrinsics.compare((int) str2.charAt(!z ? i : length), 32) <= 0;
                        if (z) {
                            if (!z2) {
                                break;
                            } else {
                                length--;
                            }
                        } else if (z2) {
                            i++;
                        } else {
                            z = true;
                        }
                    }
                    String J = com.facebook.internal.E.J(h.c(str, str2.subSequence(i, length + 1).toString()));
                    if (concurrentHashMap.containsKey(str)) {
                        String str3 = concurrentHashMap.get(str);
                        if (str3 == null || (split = new Regex(",").split(str3, 0)) == null || (strArr = (String[]) split.toArray(new String[0])) == null) {
                            strArr = new String[0];
                        }
                        Set mutableSetOf = SetsKt.mutableSetOf(Arrays.copyOf(strArr, strArr.length));
                        if (mutableSetOf.contains(J)) {
                            return;
                        }
                        StringBuilder sb = new StringBuilder();
                        if (strArr.length == 0) {
                            sb.append(J);
                        } else if (strArr.length < 5) {
                            sb.append(str3);
                            sb.append(",");
                            sb.append(J);
                        } else {
                            for (int i2 = 1; i2 < 5; i2++) {
                                sb.append(strArr[i2]);
                                sb.append(",");
                            }
                            sb.append(J);
                            mutableSetOf.remove(strArr[0]);
                        }
                        concurrentHashMap.put(str, sb.toString());
                    } else {
                        concurrentHashMap.put(str, J);
                    }
                }
                h.f("com.facebook.appevents.UserDataStore.internalUserData", com.facebook.internal.E.D(concurrentHashMap));
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, H.class);
            }
        }
    }

    public z(p loggerImpl) {
        Intrinsics.checkNotNullParameter(loggerImpl, "loggerImpl");
        this.a = loggerImpl;
    }

    public z(Context context) {
        this(new p(context, (String) null));
    }
}
