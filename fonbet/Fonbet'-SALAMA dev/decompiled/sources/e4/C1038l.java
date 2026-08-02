package e4;

import E5.V;
import android.app.Activity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.MultiFactorSession;
import com.google.firebase.auth.PhoneAuthProvider$ForceResendingToken;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import java.util.concurrent.Executor;

/* renamed from: e4.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1038l {

    /* renamed from: a, reason: collision with root package name */
    public final FirebaseAuth f12683a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f12684b;

    /* renamed from: c, reason: collision with root package name */
    public final V f12685c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f12686d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12687e;

    /* renamed from: f, reason: collision with root package name */
    public final Activity f12688f;

    /* renamed from: g, reason: collision with root package name */
    public final PhoneAuthProvider$ForceResendingToken f12689g;

    /* renamed from: h, reason: collision with root package name */
    public final MultiFactorSession f12690h;

    /* renamed from: i, reason: collision with root package name */
    public final PhoneMultiFactorInfo f12691i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f12692k;

    public C1038l(FirebaseAuth firebaseAuth, Long l7, V v6, Executor executor, String str, Activity activity, PhoneAuthProvider$ForceResendingToken phoneAuthProvider$ForceResendingToken, MultiFactorSession multiFactorSession, PhoneMultiFactorInfo phoneMultiFactorInfo) {
        this.f12683a = firebaseAuth;
        this.f12687e = str;
        this.f12684b = l7;
        this.f12685c = v6;
        this.f12688f = activity;
        this.f12686d = executor;
        this.f12689g = phoneAuthProvider$ForceResendingToken;
        this.f12690h = multiFactorSession;
        this.f12691i = phoneMultiFactorInfo;
    }
}
