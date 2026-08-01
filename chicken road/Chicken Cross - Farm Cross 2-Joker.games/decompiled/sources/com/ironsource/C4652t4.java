package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.t4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4652t4 implements M8, L8 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4655t7 f8671a;

    /* JADX WARN: Multi-variable type inference failed */
    public C4652t4() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.L8
    public void a(Context context, EnumC4634s4 source, String key, String value) {
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        InterfaceC4742y4 a2 = this.f8671a.a(context, source);
        if (a2 != null) {
            a2.b(key, value);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            IronLog.INTERNAL.error("Shared storage does not exist for source: " + source);
        }
    }

    public C4652t4(InterfaceC4655t7 sharedSignalsStorageFactory) {
        Intrinsics.checkNotNullParameter(sharedSignalsStorageFactory, "sharedSignalsStorageFactory");
        this.f8671a = sharedSignalsStorageFactory;
    }

    @Override // com.ironsource.M8
    public String a(Context context, EnumC4634s4 source, String key) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        InterfaceC4742y4 a2 = this.f8671a.a(context, source);
        if (a2 != null) {
            return InterfaceC4742y4.a(a2, key, null, 2, null);
        }
        IronLog.INTERNAL.error("Shared storage does not exist for source: " + source);
        return null;
    }

    public /* synthetic */ C4652t4(InterfaceC4655t7 interfaceC4655t7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C4706w4() : interfaceC4655t7);
    }
}
