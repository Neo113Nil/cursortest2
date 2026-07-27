package v3;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/* renamed from: v3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1498b {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f12096a = Collections.unmodifiableSet(new HashSet(Arrays.asList(429, 502, 503, 504)));

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        hashSet.add(4);
        hashSet.add(8);
        hashSet.add(10);
        hashSet.add(11);
        hashSet.add(14);
        hashSet.add(15);
        Collections.unmodifiableSet((Set) hashSet.stream().map(new A3.b(26)).collect(Collectors.toSet()));
    }
}
