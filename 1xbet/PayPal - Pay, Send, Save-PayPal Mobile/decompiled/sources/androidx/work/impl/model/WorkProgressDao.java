package androidx.work.impl.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/work/impl/model/WorkProgressDao;", "", "Landroidx/work/impl/model/WorkProgress;", "progress", "", "insert", "(Landroidx/work/impl/model/WorkProgress;)V", "", "workSpecId", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "(Ljava/lang/String;)V", "deleteAll", "()V", "Landroidx/work/Data;", "getProgressForWorkSpecId", "(Ljava/lang/String;)Landroidx/work/Data;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface WorkProgressDao {
    void delete(java.lang.String workSpecId);

    void deleteAll();

    androidx.work.Data getProgressForWorkSpecId(java.lang.String workSpecId);

    void insert(androidx.work.impl.model.WorkProgress progress);
}
