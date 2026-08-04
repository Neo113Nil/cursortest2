package p037f;

import android.os.Parcelable;
import java.util.HashMap;
import p045g.a;

/* JADX INFO: loaded from: classes.dex */
public final class e extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f12751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f12752c;

    public e(h hVar, String str, a aVar) {
        this.f12752c = hVar;
        this.f12750a = str;
        this.f12751b = aVar;
    }

    public final void a(Object obj) {
        h hVar = this.f12752c;
        HashMap map = hVar.f12758b;
        String str = this.f12750a;
        Integer num = (Integer) map.get(str);
        a aVar = this.f12751b;
        if (num != null) {
            hVar.f12760d.add(str);
            try {
                hVar.b(num.intValue(), aVar, (Parcelable) obj);
                return;
            } catch (Exception e7) {
                hVar.f12760d.remove(str);
                throw e7;
            }
        }
        throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
    }

    public final void b() {
        this.f12752c.e(this.f12750a);
    }
}
