package sg.bigo.ads.K0;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class G extends LinkedHashMap {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12343a;

    public G(int i) {
        this.f12343a = i;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.f12343a;
    }
}
