package Ve;

import Ae.C2406m0;
import B1.C2548q;
import Sc.InterfaceC4008j;
import android.app.Dialog;
import android.content.DialogInterface;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.AbstractC5434v;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.R;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LVe/Mq;", "LVe/oa;", "LVe/r4;", "LVe/Zd;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Mq extends AbstractC4497oa<C4577r4, Zd> {

    /* renamed from: f, reason: collision with root package name */
    public Ql0.i f29497f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC4008j f29498g = Sc.k.b(Fp.f29023b);

    /* renamed from: h, reason: collision with root package name */
    public SensorManager f29499h;

    /* renamed from: i, reason: collision with root package name */
    public Sensor f29500i;

    /* renamed from: j, reason: collision with root package name */
    public Dialog f29501j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f29502k;

    /* renamed from: l, reason: collision with root package name */
    public xe.B0 f29503l;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        if (kotlin.text.h.t(r7, "│ METRIC SENT", false) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        if (r6 != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0055, code lost:
    
        r1.add(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005c, code lost:
    
        if (r1.size() <= 800) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005e, code lost:
    
        r1.removeFirst();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String y(File file) {
        LinkedList linkedList = new LinkedList();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            try {
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                int i11 = 0;
                loop0: while (true) {
                    boolean z11 = false;
                    boolean z12 = false;
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break loop0;
                            }
                            if (!kotlin.text.h.e0(readLine, "┌────────────────────────────────────────────────", false)) {
                                if (z11) {
                                    if (kotlin.text.h.t(readLine, "│ REQUEST :", false)) {
                                        if (!kotlin.text.h.t(readLine, "/metrics/", false)) {
                                        }
                                        z12 = true;
                                    }
                                }
                                if (kotlin.text.h.e0(readLine, "└────────────────────────────────────────────────", false)) {
                                    break;
                                }
                            } else {
                                z11 = true;
                                z12 = false;
                            }
                            if (!z12) {
                                linkedList.add(readLine);
                                while (linkedList.size() > 800) {
                                    linkedList.removeFirst();
                                }
                            }
                        } finally {
                        }
                    }
                }
                Unit unit = Unit.f71690a;
                bufferedReader.close();
                inputStreamReader.close();
                fileInputStream.close();
                StringBuilder sb2 = new StringBuilder();
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (i11 > 0) {
                        sb2.append("\n");
                    }
                    sb2.append(str);
                    i11++;
                }
                if (linkedList.size() >= 800) {
                    sb2.append("\n\n... (показаны последние " + i11 + " строк)");
                }
                String sb3 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(sb3, "result.toString()");
                return sb3;
            } finally {
            }
        } finally {
        }
    }

    @Override // com.google.android.material.bottomsheet.b, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    public final void dismiss() {
        synchronized (this) {
            if (!this.f29502k) {
                this.f29502k = true;
                Mh block = new Mh(this);
                Intrinsics.checkNotNullParameter(block, "block");
                ((C4577r4) u()).d0(Qa.f29764a);
            }
        }
        if (getParentFragmentManager().H0()) {
            return;
        }
        super.dismiss();
    }

    @Override // Ve.AbstractC4497oa, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C4740wn block = new C4740wn(this, 0);
        Intrinsics.checkNotNullParameter(block, "block");
    }

    @Override // Ve.AbstractC4497oa, com.google.android.material.bottomsheet.b, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    public final Dialog onCreateDialog(Bundle bundle) {
        final Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCanceledOnTouchOutside(((C4577r4) u()).f31951y);
        onCreateDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: Ve.Kq
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                Dialog dialog = onCreateDialog;
                Intrinsics.checkNotNullParameter(dialog, "$dialog");
                Mq this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                BottomSheetBehavior from = BottomSheetBehavior.from(dialog.findViewById(R.id.design_bottom_sheet));
                Intrinsics.checkNotNullExpressionValue(from, "from<View>(\n            …et)\n                    )");
                this$0.getClass();
                from.setState(3);
                from.setHideable(true);
                from.setSkipCollapsed(true);
            }
        });
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        synchronized (this) {
            if (!this.f29502k) {
                this.f29502k = true;
                Mh block = new Mh(this);
                Intrinsics.checkNotNullParameter(block, "block");
                ((C4577r4) u()).d0(Qa.f29764a);
            }
        }
        super.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onPause() {
        super.onPause();
        Xn block = new Xn(this, 0);
        Intrinsics.checkNotNullParameter(block, "block");
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onResume() {
        super.onResume();
        C4476ni block = new C4476ni(this, 1);
        Intrinsics.checkNotNullParameter(block, "block");
    }

    @Override // Ve.AbstractC4497oa
    public final X4.a t() {
        View d11;
        View inflate = getLayoutInflater().inflate(spay.sdk.R.layout.spay_bottom_sheet_sdk, (ViewGroup) null, false);
        int i11 = spay.sdk.R.id.sbss_aciv_background;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, inflate);
        if (appCompatImageView != null) {
            i11 = spay.sdk.R.id.sbss_fcv_content;
            if (((FragmentContainerView) C2548q.d(i11, inflate)) != null && (d11 = C2548q.d((i11 = spay.sdk.R.id.sbss_include_indicator), inflate)) != null) {
                Zd zd2 = new Zd((ConstraintLayout) inflate, appCompatImageView);
                Intrinsics.checkNotNullExpressionValue(zd2, "inflate(layoutInflater)");
                return zd2;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @Override // Ve.AbstractC4497oa
    public final void v() {
        C4792yj c4792yj = Ul.f30136b;
        if (c4792yj != null) {
            this.f31718e = (InterfaceC4436m7) c4792yj.f32584a.f30484l.get();
            this.f29497f = new Ql0.i();
        }
    }

    @Override // Ve.AbstractC4497oa
    public final void w() {
        Ae.M0 m02 = ((C4577r4) u()).f31946t;
        AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new Ym(this, bVar, m02, null, this), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new C4506oj(this, bVar, ((C4577r4) u()).f31947u, null, this), 3);
        C10727i.c(androidx.lifecycle.K.a(this), null, null, new Tk(this, bVar, new C2406m0(((C4577r4) u()).f31948v), null, this), 3);
    }

    @Override // Ve.AbstractC4497oa
    public final void x() {
        androidx.fragment.app.Q p11 = getChildFragmentManager().p();
        p11.c(new C4279gn(), spay.sdk.R.id.sbss_fcv_content);
        p11.g("EmptyFragment");
        p11.i();
    }

    public final void z(Bc bc2, String str) {
        if (Intrinsics.d(getChildFragmentManager().r0().get(0).getTag(), str)) {
            return;
        }
        View requireView = getChildFragmentManager().r0().get(0).requireView();
        Intrinsics.checkNotNullExpressionValue(requireView, "childFragmentManager.fragments[0].requireView()");
        boolean z11 = bc2 instanceof Cr;
        bc2.setSharedElementEnterTransition(z11 ? new I5(0L) : new I5(600L));
        androidx.fragment.app.Q transitToFragment$lambda$8 = getChildFragmentManager().p();
        transitToFragment$lambda$8.f(requireView, requireView.getTransitionName());
        transitToFragment$lambda$8.w();
        transitToFragment$lambda$8.r(spay.sdk.R.id.sbss_fcv_content, bc2, str);
        Intrinsics.checkNotNullExpressionValue(transitToFragment$lambda$8, "transitToFragment$lambda$8");
        if (z11) {
            transitToFragment$lambda$8.k();
        } else {
            transitToFragment$lambda$8.i();
        }
    }
}
