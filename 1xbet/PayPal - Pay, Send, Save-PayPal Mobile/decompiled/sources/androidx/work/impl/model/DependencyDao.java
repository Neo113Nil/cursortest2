package androidx.work.impl.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0010\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/work/impl/model/DependencyDao;", "", "Landroidx/work/impl/model/Dependency;", "dependency", "", "insertDependency", "(Landroidx/work/impl/model/Dependency;)V", "", "id", "", "hasCompletedAllPrerequisites", "(Ljava/lang/String;)Z", "", "getPrerequisites", "(Ljava/lang/String;)Ljava/util/List;", "getDependentWorkIds", "hasDependents"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DependencyDao {
    java.util.List<java.lang.String> getDependentWorkIds(java.lang.String id);

    java.util.List<java.lang.String> getPrerequisites(java.lang.String id);

    boolean hasCompletedAllPrerequisites(java.lang.String id);

    boolean hasDependents(java.lang.String id);

    void insertDependency(androidx.work.impl.model.Dependency dependency);
}
