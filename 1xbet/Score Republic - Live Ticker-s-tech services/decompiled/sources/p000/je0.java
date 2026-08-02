package p000;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class je0 {

    /* JADX INFO: renamed from: d */
    public static final Logger f3912d = Logger.getLogger(je0.class.getName());

    /* JADX INFO: renamed from: e */
    public static final je0 f3913e = new je0();

    /* JADX INFO: renamed from: a */
    public final ConcurrentSkipListMap f3914a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f3915b;

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap f3916c;

    public je0() {
        new ConcurrentSkipListMap();
        this.f3914a = new ConcurrentSkipListMap();
        this.f3915b = new ConcurrentHashMap();
        this.f3916c = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }
}
