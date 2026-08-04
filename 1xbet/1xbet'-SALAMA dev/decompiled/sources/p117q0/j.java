package p117q0;

import A1.x0;
import android.content.Context;
import android.os.Bundle;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.d;
import android.support.v4.media.session.t;
import com.ryanheise.audioservice.AudioService;
import java.util.ArrayList;
import p028d6.k;

/* JADX INFO: loaded from: classes.dex */
public class j extends MediaBrowserService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I4.j f15754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I4.j f15755b;

    public j(I4.j jVar, Context context) {
        this.f15755b = jVar;
        this.f15754a = jVar;
        attachBaseContext(context);
    }

    @Override // android.service.media.MediaBrowserService
    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i7, Bundle bundle) {
        int i8;
        t.Z(bundle);
        Bundle bundle2 = null;
        Bundle bundle3 = bundle == null ? null : new Bundle(bundle);
        I4.j jVar = this.f15754a;
        s sVar = (s) jVar.f3681e;
        if (bundle3 == null || bundle3.getInt("extra_client_version", 0) == 0) {
            i8 = -1;
        } else {
            bundle3.remove("extra_client_version");
            jVar.f3679c = new Messenger(sVar.f15788f);
            Bundle bundle4 = new Bundle();
            bundle4.putInt("extra_service_version", 2);
            bundle4.putBinder("extra_messenger", ((Messenger) jVar.f3679c).getBinder());
            MediaSessionCompat$Token mediaSessionCompat$Token = sVar.f15789x;
            if (mediaSessionCompat$Token != null) {
                d dVarA = mediaSessionCompat$Token.a();
                bundle4.putBinder("extra_session_binder", dVarA != null ? dVarA.asBinder() : null);
            } else {
                ((ArrayList) jVar.f3680d).add(bundle4);
            }
            int i9 = bundle3.getInt("extra_calling_pid", -1);
            bundle3.remove("extra_calling_pid");
            i8 = i9;
            bundle2 = bundle4;
        }
        h hVar = new h((s) jVar.f3681e, str, i8, i7, null);
        sVar.getClass();
        k kVarB = sVar.b(bundle3);
        if (((Messenger) jVar.f3679c) != null) {
            sVar.f15786d.add(hVar);
        }
        Bundle bundle5 = (Bundle) kVarB.f12448c;
        if (bundle2 == null) {
            bundle2 = bundle5;
        } else if (bundle5 != null) {
            bundle2.putAll(bundle5);
        }
        return new MediaBrowserService.BrowserRoot((String) kVarB.f12447b, bundle2);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result) {
        x0 x0Var = new x0(result, 19);
        I4.j jVar = this.f15754a;
        jVar.getClass();
        i iVar = new i(str, x0Var, 0);
        s sVar = (s) jVar.f3681e;
        h hVar = sVar.f15785c;
        ((AudioService) sVar).c(str, iVar, null);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadItem(String str, MediaBrowserService.Result result) {
        x0 x0Var = new x0(result, 19);
        I4.j jVar = this.f15755b;
        jVar.getClass();
        i iVar = new i(str, x0Var, 1);
        s sVar = (s) jVar.f3682f;
        h hVar = sVar.f15785c;
        sVar.d(str, iVar);
    }
}
