package Ve;

import Ae.InterfaceC2397i;
import android.content.Context;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.view.SPayTextView;
import spay.sdk.view.otpTextView.SpayOtpTextView;

/* renamed from: Ve.ta, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4641ta implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4400l0 f32095a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f32096b;

    public C4641ta(C4400l0 c4400l0, Context context) {
        this.f32095a = c4400l0;
        this.f32096b = context;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        Sr sr = (Sr) obj;
        C4400l0 c4400l0 = this.f32095a;
        SPayTextView observeViewModel$lambda$17$lambda$10$lambda$9 = c4400l0.f31487e;
        Intrinsics.checkNotNullExpressionValue(observeViewModel$lambda$17$lambda$10$lambda$9, "observeViewModel$lambda$17$lambda$10$lambda$9");
        observeViewModel$lambda$17$lambda$10$lambda$9.setVisibility(sr == null ? 4 : 0);
        observeViewModel$lambda$17$lambda$10$lambda$9.setText(sr != null ? E.f(sr, this.f32096b) : null);
        if (sr != null) {
            SpayOtpTextView spayOtpTextView = c4400l0.f31486d;
            spayOtpTextView.f98901d = true;
            ArrayList arrayList = spayOtpTextView.f98898a;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    C4782y9.a((C4782y9) arrayList.get(i11), "", false, spayOtpTextView.f98901d, false, 10);
                    ((C4782y9) arrayList.get(i11)).b(-1);
                }
            }
        }
        return Unit.f71690a;
    }
}
