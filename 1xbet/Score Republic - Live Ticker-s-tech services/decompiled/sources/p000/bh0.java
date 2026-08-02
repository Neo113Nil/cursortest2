package p000;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bh0 implements f70, Serializable {

    /* JADX INFO: renamed from: j */
    public final int f875j;

    public bh0(int i) {
        this.f875j = i;
    }

    @Override // p000.f70
    /* JADX INFO: renamed from: b */
    public final int mo667b() {
        return this.f875j;
    }

    public final String toString() {
        l01.f4622a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
