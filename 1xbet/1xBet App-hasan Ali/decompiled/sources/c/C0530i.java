package c;

import android.content.Intent;
import android.os.Bundle;
import g.C1954a;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: c.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0530i {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f7331a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f7332b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7333c;

    /* renamed from: d, reason: collision with root package name */
    public final transient LinkedHashMap f7334d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f7335e;
    public final Bundle f;

    public C0530i() {
        new LinkedHashMap();
        this.f7333c = new ArrayList();
        this.f7334d = new LinkedHashMap();
        this.f7335e = new LinkedHashMap();
        this.f = new Bundle();
    }

    public final boolean a(int i, int i5, Intent intent) {
        String str = (String) this.f7331a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        this.f7335e.remove(str);
        this.f.putParcelable(str, new C1954a(i5, intent));
        return true;
    }
}
