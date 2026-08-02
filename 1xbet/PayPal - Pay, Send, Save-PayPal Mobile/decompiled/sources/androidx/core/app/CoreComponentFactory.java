package androidx.core.app;

/* loaded from: classes7.dex */
public class CoreComponentFactory extends android.app.AppComponentFactory {

    public interface CompatWrapped {
        java.lang.Object getWrapper();
    }

    @Override // android.app.AppComponentFactory
    public android.app.Activity instantiateActivity(java.lang.ClassLoader classLoader, java.lang.String str, android.content.Intent intent) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
        return (android.app.Activity) getHighSpeedVideoFpsRangesFor(super.instantiateActivity(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    public android.app.Application instantiateApplication(java.lang.ClassLoader classLoader, java.lang.String str) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
        return (android.app.Application) getHighSpeedVideoFpsRangesFor(super.instantiateApplication(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    public android.content.BroadcastReceiver instantiateReceiver(java.lang.ClassLoader classLoader, java.lang.String str, android.content.Intent intent) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
        return (android.content.BroadcastReceiver) getHighSpeedVideoFpsRangesFor(super.instantiateReceiver(classLoader, str, intent));
    }

    @Override // android.app.AppComponentFactory
    public android.content.ContentProvider instantiateProvider(java.lang.ClassLoader classLoader, java.lang.String str) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
        return (android.content.ContentProvider) getHighSpeedVideoFpsRangesFor(super.instantiateProvider(classLoader, str));
    }

    @Override // android.app.AppComponentFactory
    public android.app.Service instantiateService(java.lang.ClassLoader classLoader, java.lang.String str, android.content.Intent intent) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
        return (android.app.Service) getHighSpeedVideoFpsRangesFor(super.instantiateService(classLoader, str, intent));
    }

    static <T> T getHighSpeedVideoFpsRangesFor(T t) {
        T t2;
        return (!(t instanceof androidx.core.app.CoreComponentFactory.CompatWrapped) || (t2 = (T) ((androidx.core.app.CoreComponentFactory.CompatWrapped) t).getWrapper()) == null) ? t : t2;
    }
}
