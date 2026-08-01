package com.ironsource;

import android.content.Context;
import com.ironsource.InterfaceC4527m4;
import com.ironsource.InterfaceC4530m7;
import com.ironsource.environment.ContextProvider;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class B3 implements InterfaceC4530m7, InterfaceC4530m7.a {

    /* renamed from: a, reason: collision with root package name */
    private final Wc f7563a;
    private final C4681uf b;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7564a;

        static {
            int[] iArr = new int[F3.values().length];
            try {
                iArr[F3.Pacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[F3.ShowCount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[F3.Delivery.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7564a = iArr;
        }
    }

    public B3() {
        this(null, null, null, 7, null);
    }

    @Override // com.ironsource.InterfaceC4530m7
    public synchronized D3 a(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        D3 a2 = this.f7563a.a(identifier);
        if (a2.d()) {
            return a2;
        }
        return this.b.a(identifier);
    }

    @Override // com.ironsource.InterfaceC4530m7.a
    public synchronized void b(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f7563a.b(identifier);
        this.b.b(identifier);
    }

    public B3(InterfaceC4527m4 currentTimeProvider, G7 pacingDataRepository, N8 showCountDataRepository) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(pacingDataRepository, "pacingDataRepository");
        Intrinsics.checkNotNullParameter(showCountDataRepository, "showCountDataRepository");
        this.f7563a = new Wc(currentTimeProvider, pacingDataRepository);
        this.b = new C4681uf(currentTimeProvider, showCountDataRepository);
    }

    @Override // com.ironsource.InterfaceC4530m7.a
    public synchronized Object a(String identifier, F3 cappingType, InterfaceC4494k7 cappingConfig) {
        Object a2;
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        int i = a.f7564a[cappingType.ordinal()];
        if (i == 1) {
            a2 = this.f7563a.a(identifier, cappingType, cappingConfig);
        } else if (i == 2) {
            a2 = this.b.a(identifier, cappingType, cappingConfig);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Companion companion = Result.INSTANCE;
            a2 = Result.m8079constructorimpl(Unit.INSTANCE);
        }
        return a2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ B3(InterfaceC4527m4 interfaceC4527m4, G7 g7, N8 n8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC4527m4, g7, n8);
        interfaceC4527m4 = (i & 1) != 0 ? new InterfaceC4527m4.a() : interfaceC4527m4;
        if ((i & 2) != 0) {
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getInstance().applicationContext");
            g7 = new Yc(new C4592pf(applicationContext, "pacing_service", null, 4, null));
        }
        if ((i & 4) != 0) {
            Context applicationContext2 = ContextProvider.getInstance().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "getInstance().applicationContext");
            n8 = new C4645sf(new C4592pf(applicationContext2, "capping_service", null, 4, null));
        }
    }
}
