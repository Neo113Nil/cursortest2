package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class di1 {

    /* JADX INFO: renamed from: a */
    public final HashMap f1666a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet f1667b = new LinkedHashSet();

    /* JADX INFO: renamed from: a */
    public static void m1227a(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                dd0.m1163h(e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo1228b() {
    }
}
