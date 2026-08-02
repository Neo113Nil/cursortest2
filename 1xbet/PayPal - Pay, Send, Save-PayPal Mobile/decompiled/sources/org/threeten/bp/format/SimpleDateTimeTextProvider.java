package org.threeten.bp.format;

/* loaded from: classes18.dex */
final class SimpleDateTimeTextProvider extends org.threeten.bp.format.DateTimeTextProvider {
    private static final java.util.Comparator<java.util.Map.Entry<java.lang.String, java.lang.Long>> getHighSpeedVideoFpsRangesFor = new java.util.Comparator<java.util.Map.Entry<java.lang.String, java.lang.Long>>() { // from class: org.threeten.bp.format.SimpleDateTimeTextProvider.1
        @Override // java.util.Comparator
        public /* synthetic */ int compare(java.util.Map.Entry<java.lang.String, java.lang.Long> entry, java.util.Map.Entry<java.lang.String, java.lang.Long> entry2) {
            return entry2.getKey().length() - entry.getKey().length();
        }
    };
    private final java.util.concurrent.ConcurrentMap<java.util.Map.Entry<org.threeten.bp.temporal.TemporalField, java.util.Locale>, java.lang.Object> getHighSpeedVideoSizes = new java.util.concurrent.ConcurrentHashMap(16, 0.75f, 2);

    SimpleDateTimeTextProvider() {
    }

    @Override // org.threeten.bp.format.DateTimeTextProvider
    public final java.lang.String getText(org.threeten.bp.temporal.TemporalField temporalField, long j, org.threeten.bp.format.TextStyle textStyle, java.util.Locale locale) {
        java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(temporalField, locale);
        if (highSpeedVideoSizes instanceof org.threeten.bp.format.SimpleDateTimeTextProvider.LocaleStore) {
            return ((org.threeten.bp.format.SimpleDateTimeTextProvider.LocaleStore) highSpeedVideoSizes).getHighSpeedVideoFpsRanges(j, textStyle);
        }
        return null;
    }

    @Override // org.threeten.bp.format.DateTimeTextProvider
    public final java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.Long>> getTextIterator(org.threeten.bp.temporal.TemporalField temporalField, org.threeten.bp.format.TextStyle textStyle, java.util.Locale locale) {
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.Long>> list;
        java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(temporalField, locale);
        if (!(highSpeedVideoSizes instanceof org.threeten.bp.format.SimpleDateTimeTextProvider.LocaleStore) || (list = ((org.threeten.bp.format.SimpleDateTimeTextProvider.LocaleStore) highSpeedVideoSizes).getHighSpeedVideoFpsRanges.get(textStyle)) == null) {
            return null;
        }
        return list.iterator();
    }

    private static java.lang.String getHighSpeedVideoSizes(int i, java.lang.String str, java.util.Locale locale) {
        if (locale.getLanguage().equals("zh") && locale.getCountry().equals("CN")) {
            switch (i) {
                case 1:
                    return "一";
                case 2:
                    return "二";
                case 3:
                    return "三";
                case 4:
                    return "四";
                case 5:
                    return "五";
                case 6:
                    return "六";
                case 7:
                    return "七";
                case 8:
                    return "八";
                case 9:
                    return "九";
                case 10:
                    return "十";
                case 11:
                    return "十一";
                case 12:
                    return "十二";
            }
        }
        if (locale.getLanguage().equals("ar")) {
            switch (i) {
                case 1:
                    return "ي";
                case 2:
                    return "ف";
                case 3:
                    return "م";
                case 4:
                    return "أ";
                case 5:
                    return "و";
                case 6:
                    return "ن";
                case 7:
                    return "ل";
                case 8:
                    return "غ";
                case 9:
                    return "س";
                case 10:
                    return "ك";
                case 11:
                    return "ب";
                case 12:
                    return "د";
            }
        }
        if (locale.getLanguage().equals("ja") && locale.getCountry().equals("JP")) {
            return java.lang.Integer.toString(i);
        }
        return str.substring(0, 1);
    }

    private static java.lang.String getHighSpeedVideoFpsRangesFor(int i, java.lang.String str, java.util.Locale locale) {
        if (locale.getLanguage().equals("zh") && locale.getCountry().equals("CN")) {
            switch (i) {
                case 1:
                    return "一";
                case 2:
                    return "二";
                case 3:
                    return "三";
                case 4:
                    return "四";
                case 5:
                    return "五";
                case 6:
                    return "六";
                case 7:
                    return "日";
            }
        }
        if (locale.getLanguage().equals("ar")) {
            switch (i) {
                case 1:
                    return "ن";
                case 2:
                    return "ث";
                case 3:
                    return "ر";
                case 4:
                    return "خ";
                case 5:
                    return "ج";
                case 6:
                    return "س";
                case 7:
                    return "ح";
            }
        }
        return str.substring(0, 1);
    }

    private static org.threeten.bp.format.SimpleDateTimeTextProvider.LocaleStore getHighSpeedVideoFpsRanges(java.util.Map<org.threeten.bp.format.TextStyle, java.util.Map<java.lang.Long, java.lang.String>> map) {
        map.put(org.threeten.bp.format.TextStyle.FULL_STANDALONE, map.get(org.threeten.bp.format.TextStyle.FULL));
        map.put(org.threeten.bp.format.TextStyle.SHORT_STANDALONE, map.get(org.threeten.bp.format.TextStyle.SHORT));
        if (map.containsKey(org.threeten.bp.format.TextStyle.NARROW) && !map.containsKey(org.threeten.bp.format.TextStyle.NARROW_STANDALONE)) {
            map.put(org.threeten.bp.format.TextStyle.NARROW_STANDALONE, map.get(org.threeten.bp.format.TextStyle.NARROW));
        }
        return new org.threeten.bp.format.SimpleDateTimeTextProvider.LocaleStore(map);
    }

    static final class LocaleStore {
        final java.util.Map<org.threeten.bp.format.TextStyle, java.util.List<java.util.Map.Entry<java.lang.String, java.lang.Long>>> getHighSpeedVideoFpsRanges;
        private final java.util.Map<org.threeten.bp.format.TextStyle, java.util.Map<java.lang.Long, java.lang.String>> getHighSpeedVideoSizes;

        LocaleStore(java.util.Map<org.threeten.bp.format.TextStyle, java.util.Map<java.lang.Long, java.lang.String>> map) {
            this.getHighSpeedVideoSizes = map;
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (org.threeten.bp.format.TextStyle textStyle : map.keySet()) {
                java.util.HashMap hashMap2 = new java.util.HashMap();
                for (java.util.Map.Entry<java.lang.Long, java.lang.String> entry : map.get(textStyle).entrySet()) {
                    hashMap2.put(entry.getValue(), org.threeten.bp.format.SimpleDateTimeTextProvider.getHighResolutionOutputSizeshNQ4ISI(entry.getValue(), entry.getKey()));
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(hashMap2.values());
                java.util.Collections.sort(arrayList2, org.threeten.bp.format.SimpleDateTimeTextProvider.getHighSpeedVideoFpsRangesFor);
                hashMap.put(textStyle, arrayList2);
                arrayList.addAll(arrayList2);
                hashMap.put(null, arrayList);
            }
            java.util.Collections.sort(arrayList, org.threeten.bp.format.SimpleDateTimeTextProvider.getHighSpeedVideoFpsRangesFor);
            this.getHighSpeedVideoFpsRanges = hashMap;
        }

        final java.lang.String getHighSpeedVideoFpsRanges(long j, org.threeten.bp.format.TextStyle textStyle) {
            java.util.Map<java.lang.Long, java.lang.String> map = this.getHighSpeedVideoSizes.get(textStyle);
            if (map != null) {
                return map.get(java.lang.Long.valueOf(j));
            }
            return null;
        }
    }

    static /* synthetic */ java.util.Map.Entry getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj, java.lang.Object obj2) {
        return new java.util.AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    private java.lang.Object getHighSpeedVideoSizes(org.threeten.bp.temporal.TemporalField temporalField, java.util.Locale locale) {
        java.util.AbstractMap.SimpleImmutableEntry simpleImmutableEntry;
        java.lang.Object obj;
        java.util.AbstractMap.SimpleImmutableEntry simpleImmutableEntry2 = new java.util.AbstractMap.SimpleImmutableEntry(temporalField, locale);
        java.lang.Object obj2 = this.getHighSpeedVideoSizes.get(simpleImmutableEntry2);
        if (obj2 != null) {
            return obj2;
        }
        if (temporalField == org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR) {
            java.text.DateFormatSymbols dateFormatSymbols = java.text.DateFormatSymbols.getInstance(locale);
            java.util.HashMap hashMap = new java.util.HashMap();
            simpleImmutableEntry = simpleImmutableEntry2;
            java.lang.String[] months = dateFormatSymbols.getMonths();
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put(1L, months[0]);
            hashMap2.put(2L, months[1]);
            hashMap2.put(3L, months[2]);
            hashMap2.put(4L, months[3]);
            hashMap2.put(5L, months[4]);
            hashMap2.put(6L, months[5]);
            hashMap2.put(7L, months[6]);
            hashMap2.put(8L, months[7]);
            hashMap2.put(9L, months[8]);
            hashMap2.put(10L, months[9]);
            hashMap2.put(11L, months[10]);
            hashMap2.put(12L, months[11]);
            hashMap.put(org.threeten.bp.format.TextStyle.FULL, hashMap2);
            java.util.HashMap hashMap3 = new java.util.HashMap();
            hashMap3.put(1L, getHighSpeedVideoSizes(1, months[0], locale));
            hashMap3.put(2L, getHighSpeedVideoSizes(2, months[1], locale));
            hashMap3.put(3L, getHighSpeedVideoSizes(3, months[2], locale));
            hashMap3.put(4L, getHighSpeedVideoSizes(4, months[3], locale));
            hashMap3.put(5L, getHighSpeedVideoSizes(5, months[4], locale));
            hashMap3.put(6L, getHighSpeedVideoSizes(6, months[5], locale));
            hashMap3.put(7L, getHighSpeedVideoSizes(7, months[6], locale));
            hashMap3.put(8L, getHighSpeedVideoSizes(8, months[7], locale));
            hashMap3.put(9L, getHighSpeedVideoSizes(9, months[8], locale));
            hashMap3.put(10L, getHighSpeedVideoSizes(10, months[9], locale));
            hashMap3.put(11L, getHighSpeedVideoSizes(11, months[10], locale));
            hashMap3.put(12L, getHighSpeedVideoSizes(12, months[11], locale));
            hashMap.put(org.threeten.bp.format.TextStyle.NARROW, hashMap3);
            java.lang.String[] shortMonths = dateFormatSymbols.getShortMonths();
            java.util.HashMap hashMap4 = new java.util.HashMap();
            hashMap4.put(1L, shortMonths[0]);
            hashMap4.put(2L, shortMonths[1]);
            hashMap4.put(3L, shortMonths[2]);
            hashMap4.put(4L, shortMonths[3]);
            hashMap4.put(5L, shortMonths[4]);
            hashMap4.put(6L, shortMonths[5]);
            hashMap4.put(7L, shortMonths[6]);
            hashMap4.put(8L, shortMonths[7]);
            hashMap4.put(9L, shortMonths[8]);
            hashMap4.put(10L, shortMonths[9]);
            hashMap4.put(11L, shortMonths[10]);
            hashMap4.put(12L, shortMonths[11]);
            hashMap.put(org.threeten.bp.format.TextStyle.SHORT, hashMap4);
            obj = getHighSpeedVideoFpsRanges(hashMap);
        } else {
            simpleImmutableEntry = simpleImmutableEntry2;
            if (temporalField == org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK) {
                java.text.DateFormatSymbols dateFormatSymbols2 = java.text.DateFormatSymbols.getInstance(locale);
                java.util.HashMap hashMap5 = new java.util.HashMap();
                java.lang.String[] weekdays = dateFormatSymbols2.getWeekdays();
                java.util.HashMap hashMap6 = new java.util.HashMap();
                hashMap6.put(1L, weekdays[2]);
                hashMap6.put(2L, weekdays[3]);
                hashMap6.put(3L, weekdays[4]);
                hashMap6.put(4L, weekdays[5]);
                hashMap6.put(5L, weekdays[6]);
                hashMap6.put(6L, weekdays[7]);
                hashMap6.put(7L, weekdays[1]);
                hashMap5.put(org.threeten.bp.format.TextStyle.FULL, hashMap6);
                java.util.HashMap hashMap7 = new java.util.HashMap();
                hashMap7.put(1L, getHighSpeedVideoFpsRangesFor(1, weekdays[2], locale));
                hashMap7.put(2L, getHighSpeedVideoFpsRangesFor(2, weekdays[3], locale));
                hashMap7.put(3L, getHighSpeedVideoFpsRangesFor(3, weekdays[4], locale));
                hashMap7.put(4L, getHighSpeedVideoFpsRangesFor(4, weekdays[5], locale));
                hashMap7.put(5L, getHighSpeedVideoFpsRangesFor(5, weekdays[6], locale));
                hashMap7.put(6L, getHighSpeedVideoFpsRangesFor(6, weekdays[7], locale));
                hashMap7.put(7L, getHighSpeedVideoFpsRangesFor(7, weekdays[1], locale));
                hashMap5.put(org.threeten.bp.format.TextStyle.NARROW, hashMap7);
                java.lang.String[] shortWeekdays = dateFormatSymbols2.getShortWeekdays();
                java.util.HashMap hashMap8 = new java.util.HashMap();
                hashMap8.put(1L, shortWeekdays[2]);
                hashMap8.put(2L, shortWeekdays[3]);
                hashMap8.put(3L, shortWeekdays[4]);
                hashMap8.put(4L, shortWeekdays[5]);
                hashMap8.put(5L, shortWeekdays[6]);
                hashMap8.put(6L, shortWeekdays[7]);
                hashMap8.put(7L, shortWeekdays[1]);
                hashMap5.put(org.threeten.bp.format.TextStyle.SHORT, hashMap8);
                obj = getHighSpeedVideoFpsRanges(hashMap5);
            } else if (temporalField == org.threeten.bp.temporal.ChronoField.AMPM_OF_DAY) {
                java.text.DateFormatSymbols dateFormatSymbols3 = java.text.DateFormatSymbols.getInstance(locale);
                java.util.HashMap hashMap9 = new java.util.HashMap();
                java.lang.String[] amPmStrings = dateFormatSymbols3.getAmPmStrings();
                java.util.HashMap hashMap10 = new java.util.HashMap();
                hashMap10.put(0L, amPmStrings[0]);
                hashMap10.put(1L, amPmStrings[1]);
                hashMap9.put(org.threeten.bp.format.TextStyle.FULL, hashMap10);
                hashMap9.put(org.threeten.bp.format.TextStyle.SHORT, hashMap10);
                obj = getHighSpeedVideoFpsRanges(hashMap9);
            } else if (temporalField == org.threeten.bp.temporal.ChronoField.ERA) {
                java.text.DateFormatSymbols dateFormatSymbols4 = java.text.DateFormatSymbols.getInstance(locale);
                java.util.HashMap hashMap11 = new java.util.HashMap();
                java.lang.String[] eras = dateFormatSymbols4.getEras();
                java.util.HashMap hashMap12 = new java.util.HashMap();
                hashMap12.put(0L, eras[0]);
                hashMap12.put(1L, eras[1]);
                hashMap11.put(org.threeten.bp.format.TextStyle.SHORT, hashMap12);
                if (locale.getLanguage().equals(java.util.Locale.ENGLISH.getLanguage())) {
                    java.util.HashMap hashMap13 = new java.util.HashMap();
                    hashMap13.put(0L, "Before Christ");
                    hashMap13.put(1L, "Anno Domini");
                    hashMap11.put(org.threeten.bp.format.TextStyle.FULL, hashMap13);
                } else {
                    hashMap11.put(org.threeten.bp.format.TextStyle.FULL, hashMap12);
                }
                java.util.HashMap hashMap14 = new java.util.HashMap();
                hashMap14.put(0L, eras[0].substring(0, 1));
                hashMap14.put(1L, eras[1].substring(0, 1));
                hashMap11.put(org.threeten.bp.format.TextStyle.NARROW, hashMap14);
                obj = getHighSpeedVideoFpsRanges(hashMap11);
            } else if (temporalField == org.threeten.bp.temporal.IsoFields.QUARTER_OF_YEAR) {
                java.util.HashMap hashMap15 = new java.util.HashMap();
                java.util.HashMap hashMap16 = new java.util.HashMap();
                hashMap16.put(1L, "Q1");
                hashMap16.put(2L, "Q2");
                hashMap16.put(3L, "Q3");
                hashMap16.put(4L, "Q4");
                hashMap15.put(org.threeten.bp.format.TextStyle.SHORT, hashMap16);
                java.util.HashMap hashMap17 = new java.util.HashMap();
                hashMap17.put(1L, "1st quarter");
                hashMap17.put(2L, "2nd quarter");
                hashMap17.put(3L, "3rd quarter");
                hashMap17.put(4L, "4th quarter");
                hashMap15.put(org.threeten.bp.format.TextStyle.FULL, hashMap17);
                obj = getHighSpeedVideoFpsRanges(hashMap15);
            } else {
                obj = "";
            }
        }
        java.util.AbstractMap.SimpleImmutableEntry simpleImmutableEntry3 = simpleImmutableEntry;
        this.getHighSpeedVideoSizes.putIfAbsent(simpleImmutableEntry3, obj);
        return this.getHighSpeedVideoSizes.get(simpleImmutableEntry3);
    }
}
