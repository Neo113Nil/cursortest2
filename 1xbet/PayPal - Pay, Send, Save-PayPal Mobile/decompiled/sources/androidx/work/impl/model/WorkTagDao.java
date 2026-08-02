package androidx.work.impl.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000f\u0010\u000eJ%\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/work/impl/model/WorkTagDao;", "", "Landroidx/work/impl/model/WorkTag;", "workTag", "", "insert", "(Landroidx/work/impl/model/WorkTag;)V", "", "id", "deleteByWorkSpecId", "(Ljava/lang/String;)V", "tag", "", "getWorkSpecIdsWithTag", "(Ljava/lang/String;)Ljava/util/List;", "getTagsForWorkSpecId", "", "tags", "insertTags", "(Ljava/lang/String;Ljava/util/Set;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface WorkTagDao {
    void deleteByWorkSpecId(java.lang.String id);

    java.util.List<java.lang.String> getTagsForWorkSpecId(java.lang.String id);

    java.util.List<java.lang.String> getWorkSpecIdsWithTag(java.lang.String tag);

    void insert(androidx.work.impl.model.WorkTag workTag);

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static void insertTags(androidx.work.impl.model.WorkTagDao workTagDao, java.lang.String str, java.util.Set<java.lang.String> set) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
            androidx.work.impl.model.WorkTagDao.super.insertTags(str, set);
        }
    }

    default void insertTags(java.lang.String id, java.util.Set<java.lang.String> tags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tags, "");
        java.util.Iterator<T> it = tags.iterator();
        while (it.hasNext()) {
            insert(new androidx.work.impl.model.WorkTag((java.lang.String) it.next(), id));
        }
    }
}
