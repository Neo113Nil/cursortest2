package T3;

import com.yandex.varioqub.config.model.ConfigValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final List f2800a = Collections.unmodifiableList(Arrays.asList(Double.valueOf(ConfigValue.DOUBLE_DEFAULT_VALUE), Double.valueOf(5.0d), Double.valueOf(10.0d), Double.valueOf(25.0d), Double.valueOf(50.0d), Double.valueOf(75.0d), Double.valueOf(100.0d), Double.valueOf(250.0d), Double.valueOf(500.0d), Double.valueOf(750.0d), Double.valueOf(1000.0d), Double.valueOf(2500.0d), Double.valueOf(5000.0d), Double.valueOf(7500.0d), Double.valueOf(10000.0d)));

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Double.isNaN(((Double) it.next()).doubleValue())) {
                throw new IllegalArgumentException("invalid bucket boundary: NaN");
            }
        }
        for (int i2 = 1; i2 < list.size(); i2++) {
            int i3 = i2 - 1;
            if (((Double) list.get(i3)).doubleValue() >= ((Double) list.get(i2)).doubleValue()) {
                throw new IllegalArgumentException("Bucket boundaries must be in increasing order: " + list.get(i3) + " >= " + list.get(i2));
            }
        }
        if (list.isEmpty()) {
            return;
        }
        if (((Double) list.get(0)).doubleValue() == Double.NEGATIVE_INFINITY) {
            throw new IllegalArgumentException("invalid bucket boundary: -Inf");
        }
        if (((Double) list.get(list.size() - 1)).doubleValue() == Double.POSITIVE_INFINITY) {
            throw new IllegalArgumentException("invalid bucket boundary: +Inf");
        }
    }
}
