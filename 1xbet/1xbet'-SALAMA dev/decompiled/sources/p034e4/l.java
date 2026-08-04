package p034e4;

import E5.V;
import android.app.Activity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.MultiFactorSession;
import com.google.firebase.auth.PhoneAuthProvider$ForceResendingToken;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FirebaseAuth f12689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f12690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V f12691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f12692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f12693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Activity f12694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PhoneAuthProvider$ForceResendingToken f12695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final MultiFactorSession f12696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PhoneMultiFactorInfo f12697i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f12698k;

    public l(FirebaseAuth firebaseAuth, Long l7, V v6, Executor executor, String str, Activity activity, PhoneAuthProvider$ForceResendingToken phoneAuthProvider$ForceResendingToken, MultiFactorSession multiFactorSession, PhoneMultiFactorInfo phoneMultiFactorInfo) {
        this.f12689a = firebaseAuth;
        this.f12693e = str;
        this.f12690b = l7;
        this.f12691c = v6;
        this.f12694f = activity;
        this.f12692d = executor;
        this.f12695g = phoneAuthProvider$ForceResendingToken;
        this.f12696h = multiFactorSession;
        this.f12697i = phoneMultiFactorInfo;
    }
}
