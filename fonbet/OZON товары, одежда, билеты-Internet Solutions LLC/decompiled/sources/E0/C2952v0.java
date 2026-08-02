package E0;

import B2.c;
import E0.C2924h;
import android.content.ClipData;
import android.os.Bundle;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p0.AbstractC8823a;

/* renamed from: E0.v0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2952v0 implements c.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InputConnectionC2954w0 f7311a;

    C2952v0(InputConnectionC2954w0 inputConnectionC2954w0) {
        this.f7311a = inputConnectionC2954w0;
    }

    @Override // B2.c.b
    public final boolean d(@NotNull B2.d dVar, int i11, Bundle bundle) {
        X0 x02;
        int i12 = i11 & 1;
        InputConnectionC2954w0 inputConnectionC2954w0 = this.f7311a;
        if (i12 != 0) {
            try {
                dVar.d();
                Object e11 = dVar.e();
                Intrinsics.g(e11, "null cannot be cast to non-null type android.os.Parcelable");
                Parcelable parcelable = (Parcelable) e11;
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("EXTRA_INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e12) {
                e12.toString();
                inputConnectionC2954w0.getClass();
                return false;
            }
        }
        x02 = inputConnectionC2954w0.f7312a;
        new ClipData(dVar.b(), new ClipData.Item(dVar.a()));
        dVar.b();
        dVar.c();
        if (bundle == null) {
            Bundle bundle2 = Bundle.EMPTY;
        }
        AbstractC8823a abstractC8823a = ((C2924h.d) x02).f7244d;
        if (abstractC8823a == null) {
            return false;
        }
        abstractC8823a.a();
        throw null;
    }
}
