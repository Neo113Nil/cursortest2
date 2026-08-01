package com.inmobi.media;

import android.os.SystemClock;
import androidx.browser.customtabs.CustomTabsClient;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.squareup.picasso.Picasso;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* renamed from: com.inmobi.media.z5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC4261z5 extends AbstractC3695f0 implements Ok {
    public final C4008q1 h;
    public final Hd i;
    public final Ad j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC4261z5(C4008q1 adManagerComponent, Hd publisherCallbacks, Ad stateMachine) {
        super(adManagerComponent);
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(publisherCallbacks, "publisherCallbacks");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.h = adManagerComponent;
        this.i = publisherCallbacks;
        this.j = stateMachine;
    }

    @Override // com.inmobi.media.Ok
    public final void a() {
    }

    public final void a(byte[] bArr) {
        Z9 z9 = this.e;
        if (z9 != null) {
            z9.a("AUM-CreatedState", "load called: " + (bArr != null ? new String(bArr, Charsets.UTF_8) : null));
        }
        C3639d0 c3639d0 = this.f;
        c3639d0.getClass();
        c3639d0.f7058a = SystemClock.elapsedRealtime();
        C3922n0 c3922n0 = this.g;
        BuildersKt__Builders_commonKt.launch$default(c3922n0.f7256a, null, null, new C3723g0(c3922n0, null), 3, null);
        if (b()) {
            Z9 z92 = this.e;
            if (z92 != null) {
                z92.b("AUM-CreatedState", "Missing Dependencies");
                return;
            }
            return;
        }
        C4008q1 adManagerComponent = this.h;
        Ad stateMachine = this.j;
        Intrinsics.checkNotNullParameter(adManagerComponent, "adManagerComponent");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        C3594bc adUnitTimeout = new C3594bc(adManagerComponent, stateMachine);
        Td td = (Td) this;
        Intrinsics.checkNotNullParameter(adUnitTimeout, "adUnitTimeout");
        Z9 z93 = td.e;
        if (z93 != null) {
            z93.a("AUM-NativeCreatedState", "transitionToLoadResponseState");
        }
        td.m.a(new C3936ne(bArr, td.k, adUnitTimeout, td.l, td.m), td);
    }

    public final boolean b() {
        try {
            Reflection.getOrCreateKotlinClass(Picasso.class).getSimpleName();
            try {
                Reflection.getOrCreateKotlinClass(CustomTabsClient.class).getSimpleName();
                return false;
            } catch (NoClassDefFoundError unused) {
                a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES));
                return true;
            }
        } catch (Exception unused2) {
            return false;
        }
    }

    @Override // com.inmobi.media.Ok
    public final void c() {
    }

    public final void a(InMobiAdRequestStatus inMobiAdRequestStatus) {
        Z9 z9 = this.e;
        if (z9 != null) {
            z9.b("AUM-CreatedState", "transitionToLoadDroppedState 2007");
        }
        this.j.a(new C3651dc((short) 2007, inMobiAdRequestStatus, this.h, this.i, this.j), this);
    }
}
