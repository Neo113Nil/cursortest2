package Vd;

import java.util.Comparator;
import td.InterfaceC9831W;
import td.InterfaceC9839e;
import td.InterfaceC9844j;
import td.InterfaceC9845k;
import td.InterfaceC9857w;
import td.h0;

/* loaded from: classes.dex */
public final class l implements Comparator<InterfaceC9845k> {

    /* renamed from: a, reason: collision with root package name */
    public static final l f28544a = new l();

    private static int a(InterfaceC9845k interfaceC9845k) {
        if (i.v(interfaceC9845k)) {
            return 8;
        }
        if (interfaceC9845k instanceof InterfaceC9844j) {
            return 7;
        }
        if (interfaceC9845k instanceof InterfaceC9831W) {
            return ((InterfaceC9831W) interfaceC9845k).d0() == null ? 6 : 5;
        }
        if (interfaceC9845k instanceof InterfaceC9857w) {
            return ((InterfaceC9857w) interfaceC9845k).d0() == null ? 4 : 3;
        }
        if (interfaceC9845k instanceof InterfaceC9839e) {
            return 2;
        }
        return interfaceC9845k instanceof h0 ? 1 : 0;
    }

    @Override // java.util.Comparator
    public final int compare(InterfaceC9845k interfaceC9845k, InterfaceC9845k interfaceC9845k2) {
        Integer valueOf;
        InterfaceC9845k interfaceC9845k3 = interfaceC9845k;
        InterfaceC9845k interfaceC9845k4 = interfaceC9845k2;
        int a11 = a(interfaceC9845k4) - a(interfaceC9845k3);
        if (a11 != 0) {
            valueOf = Integer.valueOf(a11);
        } else if (i.v(interfaceC9845k3) && i.v(interfaceC9845k4)) {
            valueOf = 0;
        } else {
            int compareTo = interfaceC9845k3.getName().compareTo(interfaceC9845k4.getName());
            valueOf = compareTo != 0 ? Integer.valueOf(compareTo) : null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }
}
