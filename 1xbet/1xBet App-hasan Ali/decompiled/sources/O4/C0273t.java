package O4;

import game.betting133.sports1xbet.aqua_network.AquaSportsApiService;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: O4.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0273t {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4229a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f4230b;

    /* renamed from: c, reason: collision with root package name */
    public final List f4231c;

    public C0273t(Object obj, Method method, ArrayList arrayList) {
        this.f4229a = obj;
        this.f4230b = method;
        this.f4231c = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", AquaSportsApiService.class.getName(), this.f4230b.getName(), this.f4231c);
    }
}
