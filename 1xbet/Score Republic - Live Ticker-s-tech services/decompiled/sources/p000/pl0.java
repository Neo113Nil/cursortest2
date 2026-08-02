package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class pl0 {

    /* JADX INFO: renamed from: c */
    public static final Logger f6201c = Logger.getLogger(pl0.class.getName());

    /* JADX INFO: renamed from: d */
    public static pl0 f6202d;

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f6203a = new LinkedHashSet();

    /* JADX INFO: renamed from: b */
    public List f6204b = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: a */
    public static List m3963a() {
        Logger logger = f6201c;
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(jt0.class);
        } catch (ClassNotFoundException e) {
            logger.log(Level.FINE, "Unable to find OkHttpChannelProvider", (Throwable) e);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e2) {
            logger.log(Level.FINE, "Unable to find NettyChannelProvider", (Throwable) e2);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
        } catch (ClassNotFoundException e3) {
            logger.log(Level.FINE, "Unable to find UdsNettyChannelProvider", (Throwable) e3);
        }
        return Collections.unmodifiableList(arrayList);
    }
}
