package Ef;

import Hf.z;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* loaded from: classes10.dex */
final class s implements Kf.a {

    /* renamed from: a, reason: collision with root package name */
    private final char f7964a;

    /* renamed from: b, reason: collision with root package name */
    private int f7965b = 0;

    /* renamed from: c, reason: collision with root package name */
    private LinkedList<Kf.a> f7966c = new LinkedList<>();

    s(char c11) {
        this.f7964a = c11;
    }

    @Override // Kf.a
    public final char a() {
        return this.f7964a;
    }

    @Override // Kf.a
    public final int b() {
        return this.f7965b;
    }

    @Override // Kf.a
    public final char c() {
        return this.f7964a;
    }

    @Override // Kf.a
    public final int d(f fVar, f fVar2) {
        Kf.a first;
        int i11 = fVar.f7884g;
        LinkedList<Kf.a> linkedList = this.f7966c;
        Iterator<Kf.a> it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                first = linkedList.getFirst();
                break;
            }
            first = it.next();
            if (first.b() <= i11) {
                break;
            }
        }
        return first.d(fVar, fVar2);
    }

    @Override // Kf.a
    public final void e(z zVar, z zVar2, int i11) {
        Kf.a first;
        LinkedList<Kf.a> linkedList = this.f7966c;
        Iterator<Kf.a> it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                first = linkedList.getFirst();
                break;
            } else {
                first = it.next();
                if (first.b() <= i11) {
                    break;
                }
            }
        }
        first.e(zVar, zVar2, i11);
    }

    final void f(Kf.a aVar) {
        int b11 = aVar.b();
        LinkedList<Kf.a> linkedList = this.f7966c;
        ListIterator<Kf.a> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int b12 = listIterator.next().b();
            if (b11 > b12) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (b11 == b12) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.f7964a + "' and minimum length " + b11);
            }
        }
        linkedList.add(aVar);
        this.f7965b = b11;
    }
}
