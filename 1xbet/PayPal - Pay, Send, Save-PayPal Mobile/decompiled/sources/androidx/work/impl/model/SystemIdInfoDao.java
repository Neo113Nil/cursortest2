package androidx.work.impl.model;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000b\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0010\u0010\u0012J\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/work/impl/model/SystemIdInfoDao;", "", "Landroidx/work/impl/model/SystemIdInfo;", "systemIdInfo", "", "insertSystemIdInfo", "(Landroidx/work/impl/model/SystemIdInfo;)V", "", "workSpecId", "", "generation", "getSystemIdInfo", "(Ljava/lang/String;I)Landroidx/work/impl/model/SystemIdInfo;", "Landroidx/work/impl/model/WorkGenerationalId;", "id", "(Landroidx/work/impl/model/WorkGenerationalId;)Landroidx/work/impl/model/SystemIdInfo;", "removeSystemIdInfo", "(Ljava/lang/String;I)V", "(Ljava/lang/String;)V", "(Landroidx/work/impl/model/WorkGenerationalId;)V", "", "getWorkSpecIds", "()Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SystemIdInfoDao {
    androidx.work.impl.model.SystemIdInfo getSystemIdInfo(java.lang.String workSpecId, int generation);

    java.util.List<java.lang.String> getWorkSpecIds();

    void insertSystemIdInfo(androidx.work.impl.model.SystemIdInfo systemIdInfo);

    void removeSystemIdInfo(java.lang.String workSpecId);

    void removeSystemIdInfo(java.lang.String workSpecId, int generation);

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static androidx.work.impl.model.SystemIdInfo getSystemIdInfo(androidx.work.impl.model.SystemIdInfoDao systemIdInfoDao, androidx.work.impl.model.WorkGenerationalId workGenerationalId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workGenerationalId, "");
            return androidx.work.impl.model.SystemIdInfoDao.super.getSystemIdInfo(workGenerationalId);
        }

        @java.lang.Deprecated
        public static void removeSystemIdInfo(androidx.work.impl.model.SystemIdInfoDao systemIdInfoDao, androidx.work.impl.model.WorkGenerationalId workGenerationalId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workGenerationalId, "");
            androidx.work.impl.model.SystemIdInfoDao.super.removeSystemIdInfo(workGenerationalId);
        }
    }

    default androidx.work.impl.model.SystemIdInfo getSystemIdInfo(androidx.work.impl.model.WorkGenerationalId id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        return getSystemIdInfo(id.getWorkSpecId(), id.getGeneration());
    }

    default void removeSystemIdInfo(androidx.work.impl.model.WorkGenerationalId id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        removeSystemIdInfo(id.getWorkSpecId(), id.getGeneration());
    }
}
