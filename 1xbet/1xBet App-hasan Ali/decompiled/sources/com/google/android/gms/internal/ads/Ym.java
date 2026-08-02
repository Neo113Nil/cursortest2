package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class Ym implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12357a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12358b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12359c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12360d;

    public Ym(C0558Bb c0558Bb, String str, String str2) {
        this.f12357a = 2;
        this.f12358b = str;
        this.f12359c = str2;
        this.f12360d = c0558Bb;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f12357a) {
            case 0:
                BinderC0857cn binderC0857cn = (BinderC0857cn) this.f12358b;
                binderC0857cn.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("dialog_action", "confirm");
                binderC0857cn.y3(binderC0857cn.f13042p, "rtsdc", hashMap);
                Q1.j jVar = P2.o.f4767B.f4773e;
                Activity activity = (Activity) this.f12359c;
                activity.startActivity(jVar.k(activity));
                binderC0857cn.z3();
                S2.d dVar = (S2.d) this.f12360d;
                if (dVar != null) {
                    dVar.a();
                    break;
                }
                break;
            case 1:
                BinderC0857cn binderC0857cn2 = (BinderC0857cn) this.f12358b;
                binderC0857cn2.getClass();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("dialog_action", "confirm");
                binderC0857cn2.y3(binderC0857cn2.f13042p, "dialog_click", hashMap2);
                binderC0857cn2.A3((Activity) this.f12359c, (S2.d) this.f12360d);
                break;
            default:
                C0558Bb c0558Bb = (C0558Bb) this.f12360d;
                DownloadManager downloadManager = (DownloadManager) c0558Bb.f7816o.getSystemService("download");
                try {
                    String str = (String) this.f12358b;
                    String str2 = (String) this.f12359c;
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
                    T2.L l5 = P2.o.f4767B.f4771c;
                    request.allowScanningByMediaScanner();
                    request.setNotificationVisibility(1);
                    downloadManager.enqueue(request);
                    break;
                } catch (IllegalStateException unused) {
                    c0558Bb.t("Could not store picture.");
                }
        }
    }

    public /* synthetic */ Ym(BinderC0857cn binderC0857cn, Activity activity, S2.d dVar, int i) {
        this.f12357a = i;
        this.f12358b = binderC0857cn;
        this.f12359c = activity;
        this.f12360d = dVar;
    }
}
