package p000;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: renamed from: l0 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0416l0 extends AbstractList implements List, sg0 {
    /* JADX INFO: renamed from: b */
    public abstract int mo2903b();

    /* JADX INFO: renamed from: c */
    public abstract Object mo2904c(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return mo2904c(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo2903b();
    }
}
