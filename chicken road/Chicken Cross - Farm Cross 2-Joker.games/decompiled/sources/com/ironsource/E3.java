package com.ironsource;

import androidx.media3.exoplayer.upstream.CmcdData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public enum E3 {
    Day("d", 86400000),
    Hour("h", 3600000),
    Second(CmcdData.Factory.STREAMING_FORMAT_SS, 1000);

    public static final a c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f7608a;
    private final long b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final E3 a(String str) {
            for (E3 e3 : E3.values()) {
                if (Intrinsics.areEqual(e3.f7608a, str)) {
                    return e3;
                }
            }
            return null;
        }

        private a() {
        }
    }

    E3(String str, long j) {
        this.f7608a = str;
        this.b = j;
    }

    public final long a(Integer num) {
        return (num != null ? num.intValue() : 1) * this.b;
    }

    public static /* synthetic */ long a(E3 e3, Integer num, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: inMilliseconds");
        }
        if ((i & 1) != 0) {
            num = 1;
        }
        return e3.a(num);
    }
}
