package p000;

import android.text.TextUtils;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class s00 {

    /* JADX INFO: renamed from: a */
    public final my0 f7002a;

    /* JADX INFO: renamed from: b */
    public Integer f7003b = null;

    public s00(my0 my0Var) {
        this.f7002a = my0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m4466a(C0158e1 c0158e1) throws C0122d1 {
        my0 my0Var = this.f7002a;
        if (my0Var.get() == null) {
            throw new C0122d1("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
        String[] strArr = C0158e1.f1889g;
        C0158e1.m1345b(c0158e1.m1346a());
        ArrayList arrayList = new ArrayList();
        HashMap mapM1346a = c0158e1.m1346a();
        mapM1346a.remove("triggerEvent");
        C0158e1.m1345b(mapM1346a);
        try {
            arrayList.add(new C0158e1((String) mapM1346a.get("experimentId"), (String) mapM1346a.get("variantId"), mapM1346a.containsKey("triggerEvent") ? (String) mapM1346a.get("triggerEvent") : "", C0158e1.f1890h.parse((String) mapM1346a.get("experimentStartTime")), Long.parseLong((String) mapM1346a.get("triggerTimeoutMillis")), Long.parseLong((String) mapM1346a.get("timeToLiveMillis"))));
            ArrayDeque arrayDeque = new ArrayDeque(((InterfaceC0826w3) my0Var.get()).mo4422c());
            if (this.f7003b == null) {
                this.f7003b = Integer.valueOf(((InterfaceC0826w3) my0Var.get()).mo4420a());
            }
            int iIntValue = this.f7003b.intValue();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                C0158e1 c0158e2 = (C0158e1) obj;
                while (arrayDeque.size() >= iIntValue) {
                    ((InterfaceC0826w3) my0Var.get()).mo4421b(((C0789v3) arrayDeque.pollFirst()).f8026b);
                }
                c0158e2.getClass();
                C0789v3 c0789v3 = new C0789v3();
                c0789v3.f8025a = "fiam";
                c0789v3.f8037m = c0158e2.f1894d.getTime();
                c0789v3.f8026b = c0158e2.f1891a;
                c0789v3.f8027c = c0158e2.f1892b;
                String str = c0158e2.f1893c;
                if (TextUtils.isEmpty(str)) {
                    str = null;
                }
                c0789v3.f8028d = str;
                c0789v3.f8029e = c0158e2.f1895e;
                c0789v3.f8034j = c0158e2.f1896f;
                ((InterfaceC0826w3) my0Var.get()).mo4424e(c0789v3);
                arrayDeque.offer(c0789v3);
            }
        } catch (NumberFormatException e) {
            throw new C0122d1("Could not process experiment: one of the durations could not be converted into a long.", e);
        } catch (ParseException e2) {
            throw new C0122d1("Could not process experiment: parsing experiment start time failed.", e2);
        }
    }
}
