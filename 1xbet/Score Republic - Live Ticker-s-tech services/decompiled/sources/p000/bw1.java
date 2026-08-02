package p000;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class bw1 extends jw1 {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f1013n = 3;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f1014o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f1015p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f1016q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw1(C0414kz c0414kz, Activity activity, bv1 bv1Var) {
        super((mw1) c0414kz.f4610k, true);
        this.f1015p = activity;
        this.f1016q = bv1Var;
        this.f1014o = c0414kz;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.jw1
    /* JADX INFO: renamed from: a */
    public final void mo492a() {
        Boolean boolValueOf;
        Bundle bundle = null;
        ev1 ev1VarAsInterface = null;
        switch (this.f1013n) {
            case 0:
                try {
                    Context context = (Context) this.f1015p;
                    p80.m3863h(context);
                    String strM5201p = vt1.m5201p(context);
                    Resources resources = context.getResources();
                    if (TextUtils.isEmpty(strM5201p)) {
                        strM5201p = vt1.m5201p(context);
                    }
                    int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", strM5201p);
                    if (identifier == 0) {
                        boolValueOf = null;
                    } else {
                        try {
                            boolValueOf = Boolean.valueOf(resources.getBoolean(identifier));
                        } catch (Resources.NotFoundException unused) {
                            boolValueOf = null;
                        }
                    }
                    mw1 mw1Var = (mw1) this.f1014o;
                    Object[] objArr = boolValueOf == null || !boolValueOf.booleanValue();
                    mw1Var.getClass();
                    try {
                        ev1VarAsInterface = dv1.asInterface(C0335iv.m2706c(context, objArr != false ? C0335iv.f3669c : C0335iv.f3668b, ModuleDescriptor.MODULE_ID).m2712b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    } catch (C0188ev e) {
                        mw1Var.m3435c(e, true, false);
                    }
                    mw1Var.f5174f = ev1VarAsInterface;
                    if (mw1Var.f5174f != null) {
                        int iM2705a = C0335iv.m2705a(context, ModuleDescriptor.MODULE_ID);
                        int iM2707d = C0335iv.m2707d(context, ModuleDescriptor.MODULE_ID, false);
                        int iMax = Math.max(iM2705a, iM2707d);
                        boolean z = Boolean.TRUE.equals(boolValueOf) || iM2707d < iM2705a;
                        long j = iMax;
                        mw1Var.f5175g = j;
                        wv1 wv1Var = new wv1(161000L, j, z, (Bundle) this.f1016q, vt1.m5201p(context));
                        Object[] objArr2 = mw1Var.f5175g >= 169;
                        ev1 ev1Var = mw1Var.f5174f;
                        if (objArr2 != true) {
                            p80.m3863h(ev1Var);
                            ev1Var.initialize(new vs0(context), wv1Var, this.f4100j);
                        } else {
                            p80.m3863h(ev1Var);
                            ev1Var.initializeWithElapsedTime(new vs0(context), wv1Var, this.f4100j, this.f4101k);
                        }
                    } else {
                        Log.w("FA", "Failed to connect to measurement client.");
                    }
                } catch (Exception e2) {
                    ((mw1) this.f1014o).m3435c(e2, true, false);
                    return;
                }
                break;
            case 1:
                ev1 ev1Var2 = ((mw1) this.f1014o).f5174f;
                p80.m3863h(ev1Var2);
                ev1Var2.getMaxUserProperties((String) this.f1015p, (bv1) this.f1016q);
                break;
            case 2:
                Bundle bundle2 = (Bundle) this.f1016q;
                if (bundle2 != null) {
                    bundle = new Bundle();
                    if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = bundle2.get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                }
                ev1 ev1Var3 = ((mw1) ((C0414kz) this.f1014o).f4610k).f5174f;
                p80.m3863h(ev1Var3);
                ev1Var3.onActivityCreatedByScionActivityInfo(xv1.m5690b((Activity) this.f1015p), bundle, this.f4101k);
                break;
            default:
                ev1 ev1Var4 = ((mw1) ((C0414kz) this.f1014o).f4610k).f5174f;
                p80.m3863h(ev1Var4);
                ev1Var4.onActivitySaveInstanceStateByScionActivityInfo(xv1.m5690b((Activity) this.f1015p), (bv1) this.f1016q, this.f4101k);
                break;
        }
    }

    @Override // p000.jw1
    /* JADX INFO: renamed from: b */
    public void mo493b() {
        switch (this.f1013n) {
            case 1:
                ((bv1) this.f1016q).mo785n(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw1(C0414kz c0414kz, Bundle bundle, Activity activity) {
        super((mw1) c0414kz.f4610k, true);
        this.f1016q = bundle;
        this.f1015p = activity;
        this.f1014o = c0414kz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw1(mw1 mw1Var, Context context, Bundle bundle) {
        super(mw1Var, true);
        this.f1015p = context;
        this.f1016q = bundle;
        this.f1014o = mw1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw1(mw1 mw1Var, String str, bv1 bv1Var) {
        super(mw1Var, true);
        this.f1015p = str;
        this.f1016q = bv1Var;
        Objects.requireNonNull(mw1Var);
        this.f1014o = mw1Var;
    }
}
