package sg.bigo.ads.E0;

import java.util.Comparator;

/* loaded from: classes3.dex */
public final class a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        b bVar = (b) obj;
        b bVar2 = (b) obj2;
        return (((bVar2.i - bVar2.h) + 1) * (((bVar2.g - bVar2.f) + 1) * ((bVar2.e - bVar2.d) + 1))) - (((bVar.i - bVar.h) + 1) * (((bVar.g - bVar.f) + 1) * ((bVar.e - bVar.d) + 1)));
    }
}
