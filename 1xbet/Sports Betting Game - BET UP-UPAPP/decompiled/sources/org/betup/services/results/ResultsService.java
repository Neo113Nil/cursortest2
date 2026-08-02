package org.betup.services.results;

import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.model.local.entity.LotteryBall;
import org.betup.model.local.entity.LotteryResult;
import org.betup.model.local.entity.RacingResult;

@Singleton
/* loaded from: classes2.dex */
public class ResultsService {
    private final FirebaseRemoteConfig firebaseRemoteConfig;

    public enum ImageType {
        HORSE,
        DOG
    }

    @Inject
    public ResultsService(FirebaseRemoteConfig firebaseRemoteConfig) {
        this.firebaseRemoteConfig = firebaseRemoteConfig;
    }

    public LotteryResult tryParseLotteryResults(String resultRaw) {
        if (resultRaw == null) {
            throw new IllegalArgumentException("resultRaw cannot be null!");
        }
        long max = Math.max(1L, this.firebaseRemoteConfig.getLong("ballIconsCount"));
        String string = this.firebaseRemoteConfig.getString("ballIconPath");
        Pattern compile = Pattern.compile("\\d+");
        Random random = new Random();
        Matcher matcher = compile.matcher(resultRaw);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            try {
                arrayList.add(Integer.valueOf(Integer.parseInt(matcher.group())));
            } catch (Exception e) {
                Log.e("PARSER", "FAILED TO PARSE LOTTERY RESULT", e);
            }
        }
        LotteryResult lotteryResult = new LotteryResult();
        if (arrayList.size() > 0) {
            lotteryResult.setBallCount(((Integer) arrayList.get(0)).intValue());
        }
        if (arrayList.size() > 1) {
            lotteryResult.setBallSum(((Integer) arrayList.get(1)).intValue());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Integer num : arrayList.subList(2, arrayList.size())) {
            LotteryBall lotteryBall = new LotteryBall();
            lotteryBall.setNumber(num.intValue());
            lotteryBall.setPhotoUrl(String.format(string, Long.valueOf((Math.abs(random.nextInt()) % max) + 1)));
            arrayList2.add(lotteryBall);
        }
        lotteryResult.setBalls(arrayList2);
        return lotteryResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4 A[Catch: Exception -> 0x00f2, TryCatch #2 {Exception -> 0x00f2, blocks: (B:7:0x0008, B:10:0x0029, B:13:0x003e, B:15:0x0046, B:27:0x0088, B:29:0x00c4, B:30:0x00d4, B:32:0x00db, B:33:0x00e8, B:38:0x007a), top: B:6:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00db A[Catch: Exception -> 0x00f2, TryCatch #2 {Exception -> 0x00f2, blocks: (B:7:0x0008, B:10:0x0029, B:13:0x003e, B:15:0x0046, B:27:0x0088, B:29:0x00c4, B:30:0x00d4, B:32:0x00db, B:33:0x00e8, B:38:0x007a), top: B:6:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<RacingResult> tryParseRacingResults(String resultRaw, ImageType imageType) {
        int i;
        if (resultRaw == null) {
            throw new IllegalArgumentException("resultRaw cannot be null!");
        }
        try {
            String[] split = resultRaw.split("\\n");
            Pattern compile = Pattern.compile("\\d+");
            ArrayList arrayList = new ArrayList();
            Random random = new Random();
            long max = Math.max(1L, this.firebaseRemoteConfig.getLong(imageType == ImageType.HORSE ? "jockeyIconsCount" : "dogIconsCount"));
            String string = this.firebaseRemoteConfig.getString(imageType == ImageType.HORSE ? "jockeyIconPath" : "dogIconPath");
            int length = split.length;
            int i2 = 0;
            while (i2 < length) {
                String str = split[i2];
                ArrayList arrayList2 = new ArrayList();
                try {
                    Matcher matcher = compile.matcher(str);
                    i = 0;
                    while (matcher.find()) {
                        try {
                            arrayList2.add(Integer.valueOf(Integer.parseInt(matcher.group())));
                            i = matcher.end() + 1;
                        } catch (Exception e) {
                            e = e;
                            Log.e(getClass().getName(), "Failed to parse horse racing result", e);
                            String trim = str.substring(i).replaceAll("[,.]+", "").trim();
                            RacingResult racingResult = new RacingResult();
                            racingResult.setName(trim);
                            int i3 = i2;
                            racingResult.setPhotoUrl(String.format(string, Long.valueOf((Math.abs(random.nextInt()) % max) + 1)));
                            if (arrayList2.size() <= 0) {
                            }
                            if (arrayList2.size() > 1) {
                            }
                            arrayList.add(racingResult);
                            i2 = i3 + 1;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    i = 0;
                }
                String trim2 = str.substring(i).replaceAll("[,.]+", "").trim();
                RacingResult racingResult2 = new RacingResult();
                racingResult2.setName(trim2);
                int i32 = i2;
                racingResult2.setPhotoUrl(String.format(string, Long.valueOf((Math.abs(random.nextInt()) % max) + 1)));
                if (arrayList2.size() <= 0) {
                    racingResult2.setPosition(((Integer) arrayList2.get(0)).intValue());
                }
                if (arrayList2.size() > 1) {
                    racingResult2.setNumber(((Integer) arrayList2.get(1)).intValue());
                }
                arrayList.add(racingResult2);
                i2 = i32 + 1;
            }
            return arrayList;
        } catch (Exception e3) {
            Log.e("PARSER", "ERROR WHILE PARSING RACING RESULTS ", e3);
            return new ArrayList();
        }
    }
}
