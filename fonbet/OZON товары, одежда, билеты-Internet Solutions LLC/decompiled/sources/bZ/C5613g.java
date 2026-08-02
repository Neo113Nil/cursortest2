package bZ;

import hZ.C6894a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.cdn.chooser.internal.data.dto.CdnConfigResponse;

/* renamed from: bZ.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C5613g {
    @NotNull
    public static final C6894a a(@NotNull CdnConfigResponse cdnConfigResponse) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(cdnConfigResponse, "<this>");
        List<CdnConfigResponse.ImageRuleDto> imageRules = cdnConfigResponse.getImageRules();
        ArrayList arrayList2 = new ArrayList(C7714v.z(imageRules, 10));
        for (CdnConfigResponse.ImageRuleDto imageRuleDto : imageRules) {
            arrayList2.add(new C6894a.C1059a(imageRuleDto.getHostEquals(), imageRuleDto.getHostToUse(), imageRuleDto.getHostToUseOriginal(), imageRuleDto.getCanResize()));
        }
        List<CdnConfigResponse.VideoRuleDto> videoRules = cdnConfigResponse.getVideoRules();
        ArrayList arrayList3 = new ArrayList(C7714v.z(videoRules, 10));
        for (CdnConfigResponse.VideoRuleDto videoRuleDto : videoRules) {
            arrayList3.add(new C6894a.d(videoRuleDto.getHostEquals(), videoRuleDto.getHostToUse(), videoRuleDto.getType()));
        }
        List<CdnConfigResponse.ImageWarmUpDataDto> imageWarmupList = cdnConfigResponse.getImageWarmupList();
        C6894a.c cVar = null;
        if (imageWarmupList != null) {
            List<CdnConfigResponse.ImageWarmUpDataDto> list = imageWarmupList;
            arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C6894a.b(((CdnConfigResponse.ImageWarmUpDataDto) it.next()).getUrl()));
            }
        } else {
            arrayList = null;
        }
        CdnConfigResponse.PopsConfigDto popStatsConfig = cdnConfigResponse.getPopStatsConfig();
        if (popStatsConfig != null) {
            List<CdnConfigResponse.PopsConfigDto.PointOfPresenceDto> pops = popStatsConfig.getPops();
            ArrayList arrayList4 = new ArrayList(C7714v.z(pops, 10));
            for (CdnConfigResponse.PopsConfigDto.PointOfPresenceDto pointOfPresenceDto : pops) {
                String id2 = pointOfPresenceDto.getId();
                List<CdnConfigResponse.PopsConfigDto.PointOfPresenceDto.FileDto> files = pointOfPresenceDto.getFiles();
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj : files) {
                    if (hashSet.add(((CdnConfigResponse.PopsConfigDto.PointOfPresenceDto.FileDto) obj).getId())) {
                        arrayList5.add(obj);
                    }
                }
                ArrayList arrayList6 = new ArrayList(C7714v.z(arrayList5, 10));
                Iterator it2 = arrayList5.iterator();
                while (it2.hasNext()) {
                    CdnConfigResponse.PopsConfigDto.PointOfPresenceDto.FileDto fileDto = (CdnConfigResponse.PopsConfigDto.PointOfPresenceDto.FileDto) it2.next();
                    arrayList6.add(new C6894a.c.b.C1061a(fileDto.getId(), fileDto.getUrl()));
                }
                arrayList4.add(new C6894a.c.b(id2, arrayList6));
            }
            long parseLong = Long.parseLong(popStatsConfig.getTimerFrequency());
            CdnConfigResponse.PopsConfigDto.JitterDto jitter = popStatsConfig.getJitter();
            cVar = new C6894a.c(arrayList4, parseLong, new C6894a.c.C1060a(Long.parseLong(jitter.getMin()), Long.parseLong(jitter.getMax())));
        }
        return new C6894a(arrayList2, arrayList3, arrayList, cVar);
    }
}
