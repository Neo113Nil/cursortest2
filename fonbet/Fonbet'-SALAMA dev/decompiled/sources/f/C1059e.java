package f;

import android.os.Parcelable;
import g.AbstractC1118a;
import java.util.HashMap;

/* renamed from: f.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1059e extends AbstractC1056b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f12744a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC1118a f12745b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC1062h f12746c;

    public C1059e(AbstractC1062h abstractC1062h, String str, AbstractC1118a abstractC1118a) {
        this.f12746c = abstractC1062h;
        this.f12744a = str;
        this.f12745b = abstractC1118a;
    }

    public final void a(Object obj) {
        AbstractC1062h abstractC1062h = this.f12746c;
        HashMap hashMap = abstractC1062h.f12752b;
        String str = this.f12744a;
        Integer num = (Integer) hashMap.get(str);
        AbstractC1118a abstractC1118a = this.f12745b;
        if (num != null) {
            abstractC1062h.f12754d.add(str);
            try {
                abstractC1062h.b(num.intValue(), abstractC1118a, (Parcelable) obj);
                return;
            } catch (Exception e7) {
                abstractC1062h.f12754d.remove(str);
                throw e7;
            }
        }
        throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC1118a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
    }

    public final void b() {
        this.f12746c.e(this.f12744a);
    }
}
