package U5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class V {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f6443c = Logger.getLogger(V.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static V f6444d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f6445a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f6446b = Collections.emptyList();

    public static List a() {
        Logger logger = f6443c;
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(X5.h.class);
        } catch (ClassNotFoundException e7) {
            logger.log(Level.FINE, "Unable to find OkHttpChannelProvider", (Throwable) e7);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e8) {
            logger.log(Level.FINE, "Unable to find NettyChannelProvider", (Throwable) e8);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
        } catch (ClassNotFoundException e9) {
            logger.log(Level.FINE, "Unable to find UdsNettyChannelProvider", (Throwable) e9);
        }
        return Collections.unmodifiableList(arrayList);
    }
}
