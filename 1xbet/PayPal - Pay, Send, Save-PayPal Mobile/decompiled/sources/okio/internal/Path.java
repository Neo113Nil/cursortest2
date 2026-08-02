package okio.internal;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u0005\n\u0002\b\u0007\u001a\u0016\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003*\u00020\u0000H\u0080\b¢\u0006\u0004\b\b\u0010\u0006\u001a\u0014\u0010\n\u001a\u00020\t*\u00020\u0000H\u0080\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0014\u0010\f\u001a\u00020\t*\u00020\u0000H\u0080\b¢\u0006\u0004\b\f\u0010\u000b\u001a\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0014\u0010\u0010\u001a\u00020\u0007*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0014\u0010\u0012\u001a\u00020\u0004*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0014\u0010\u0002\u001a\u0014\u0010\u0015\u001a\u00020\t*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0015\u0010\u000b\u001a$\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\tH\u0080\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a$\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\tH\u0080\b¢\u0006\u0004\b\u0018\u0010\u001a\u001a$\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\tH\u0080\b¢\u0006\u0004\b\u0018\u0010\u001c\u001a#\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0018\u0010\u001d\u001a\u001c\u0010\u001f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b\u001f\u0010 \u001a\u0014\u0010!\u001a\u00020\u0000*\u00020\u0000H\u0080\b¢\u0006\u0004\b!\u0010\u0002\u001a\u001c\u0010#\u001a\u00020\"*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b#\u0010$\u001a\u001e\u0010&\u001a\u00020\t*\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010%H\u0080\b¢\u0006\u0004\b&\u0010'\u001a\u0014\u0010(\u001a\u00020\"*\u00020\u0000H\u0080\b¢\u0006\u0004\b(\u0010)\u001a\u0014\u0010*\u001a\u00020\u0004*\u00020\u0000H\u0080\b¢\u0006\u0004\b*\u0010\u0013\u001a\u001b\u0010+\u001a\u00020\u0000*\u00020\u00042\u0006\u0010\u0017\u001a\u00020\tH\u0000¢\u0006\u0004\b+\u0010,\u001a\u001b\u0010-\u001a\u00020\u0000*\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\tH\u0000¢\u0006\u0004\b-\u0010.\u001a\u0013\u0010/\u001a\u00020\u0007*\u00020\u0004H\u0002¢\u0006\u0004\b/\u00100\u001a\u0013\u0010/\u001a\u00020\u0007*\u000201H\u0002¢\u0006\u0004\b/\u00102\"\u0014\u00105\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104\"\u0014\u00103\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00104\"\u0014\u00107\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00104\"\u0014\u00106\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00104\"\u0014\u0010/\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104\"\u001a\u00108\u001a\u0004\u0018\u00010\u0007*\u00020\u00008CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0011"}, d2 = {"Lokio/Path;", "commonRoot", "(Lokio/Path;)Lokio/Path;", "", "", "commonSegments", "(Lokio/Path;)Ljava/util/List;", "Lokio/ByteString;", "commonSegmentsBytes", "", "commonIsAbsolute", "(Lokio/Path;)Z", "commonIsRelative", "", "commonVolumeLetter", "(Lokio/Path;)Ljava/lang/Character;", "commonNameBytes", "(Lokio/Path;)Lokio/ByteString;", "commonName", "(Lokio/Path;)Ljava/lang/String;", "commonParent", "commonIsRoot", "child", "normalize", "commonResolve", "(Lokio/Path;Ljava/lang/String;Z)Lokio/Path;", "(Lokio/Path;Lokio/ByteString;Z)Lokio/Path;", "Lokio/Buffer;", "(Lokio/Path;Lokio/Buffer;Z)Lokio/Path;", "(Lokio/Path;Lokio/Path;Z)Lokio/Path;", "other", "commonRelativeTo", "(Lokio/Path;Lokio/Path;)Lokio/Path;", "commonNormalized", "", "commonCompareTo", "(Lokio/Path;Lokio/Path;)I", "", "commonEquals", "(Lokio/Path;Ljava/lang/Object;)Z", "commonHashCode", "(Lokio/Path;)I", "commonToString", "commonToPath", "(Ljava/lang/String;Z)Lokio/Path;", "toPath", "(Lokio/Buffer;Z)Lokio/Path;", "getHighSpeedVideoSizes", "(Ljava/lang/String;)Lokio/ByteString;", "", "(B)Lokio/ByteString;", "Camera2StreamConfigurationMap", "Lokio/ByteString;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizesFor"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* renamed from: okio.internal.-Path, reason: invalid class name */
/* loaded from: classes5.dex */
public final class Path {
    private static final okio.ByteString Camera2StreamConfigurationMap = okio.ByteString.INSTANCE.encodeUtf8(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
    private static final okio.ByteString getHighSpeedVideoSizes = okio.ByteString.INSTANCE.encodeUtf8("\\");
    private static final okio.ByteString getHighSpeedVideoFpsRanges = okio.ByteString.INSTANCE.encodeUtf8("/\\");
    private static final okio.ByteString getHighResolutionOutputSizeshNQ4ISI = okio.ByteString.INSTANCE.encodeUtf8(".");
    private static final okio.ByteString getHighSpeedVideoFpsRangesFor = okio.ByteString.INSTANCE.encodeUtf8("..");

    public static final okio.Path commonRoot(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        int access$rootLength = access$rootLength(path);
        if (access$rootLength == -1) {
            return null;
        }
        return new okio.Path(path.getBytes().substring(0, access$rootLength));
    }

    public static final java.util.List<okio.ByteString> commonSegmentsBytes(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int access$rootLength = access$rootLength(path);
        if (access$rootLength == -1) {
            access$rootLength = 0;
        } else if (access$rootLength < path.getBytes().size() && path.getBytes().getByte(access$rootLength) == 92) {
            access$rootLength++;
        }
        int size = path.getBytes().size();
        int i = access$rootLength;
        while (access$rootLength < size) {
            if (path.getBytes().getByte(access$rootLength) == 47 || path.getBytes().getByte(access$rootLength) == 92) {
                arrayList.add(path.getBytes().substring(i, access$rootLength));
                i = access$rootLength + 1;
            }
            access$rootLength++;
        }
        if (i < path.getBytes().size()) {
            arrayList.add(path.getBytes().substring(i, path.getBytes().size()));
        }
        return arrayList;
    }

    public static final boolean commonIsAbsolute(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        return access$rootLength(path) != -1;
    }

    public static final boolean commonIsRelative(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        return access$rootLength(path) == -1;
    }

    public static final java.lang.Character commonVolumeLetter(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        if (okio.ByteString.indexOf$default(path.getBytes(), Camera2StreamConfigurationMap, 0, 2, (java.lang.Object) null) != -1 || path.getBytes().size() < 2 || path.getBytes().getByte(1) != 58) {
            return null;
        }
        char c = (char) path.getBytes().getByte(0);
        if (('a' > c || c >= '{') && ('A' > c || c >= '[')) {
            return null;
        }
        return java.lang.Character.valueOf(c);
    }

    public static final okio.ByteString commonNameBytes(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        int access$getIndexOfLastSlash = access$getIndexOfLastSlash(path);
        if (access$getIndexOfLastSlash != -1) {
            return okio.ByteString.substring$default(path.getBytes(), access$getIndexOfLastSlash + 1, 0, 2, null);
        }
        return (path.volumeLetter() == null || path.getBytes().size() != 2) ? path.getBytes() : okio.ByteString.EMPTY;
    }

    public static final java.lang.String commonName(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        return path.nameBytes().utf8();
    }

    public static final okio.Path commonParent(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(path.getBytes(), getHighResolutionOutputSizeshNQ4ISI) || kotlin.jvm.internal.Intrinsics.areEqual(path.getBytes(), Camera2StreamConfigurationMap) || kotlin.jvm.internal.Intrinsics.areEqual(path.getBytes(), getHighSpeedVideoSizes) || access$lastSegmentIsDotDot(path)) {
            return null;
        }
        int access$getIndexOfLastSlash = access$getIndexOfLastSlash(path);
        if (access$getIndexOfLastSlash != 2 || path.volumeLetter() == null) {
            if (access$getIndexOfLastSlash == 1 && path.getBytes().startsWith(getHighSpeedVideoSizes)) {
                return null;
            }
            if (access$getIndexOfLastSlash == -1 && path.volumeLetter() != null) {
                if (path.getBytes().size() == 2) {
                    return null;
                }
                return new okio.Path(okio.ByteString.substring$default(path.getBytes(), 0, 2, 1, null));
            }
            if (access$getIndexOfLastSlash == -1) {
                return new okio.Path(getHighResolutionOutputSizeshNQ4ISI);
            }
            if (access$getIndexOfLastSlash == 0) {
                return new okio.Path(okio.ByteString.substring$default(path.getBytes(), 0, 1, 1, null));
            }
            return new okio.Path(okio.ByteString.substring$default(path.getBytes(), 0, access$getIndexOfLastSlash, 1, null));
        }
        if (path.getBytes().size() == 3) {
            return null;
        }
        return new okio.Path(okio.ByteString.substring$default(path.getBytes(), 0, 3, 1, null));
    }

    public static final boolean commonIsRoot(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        return access$rootLength(path) == path.getBytes().size();
    }

    public static final okio.Path commonResolve(okio.Path path, java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return commonResolve(path, toPath(new okio.Buffer().writeUtf8(str), false), z);
    }

    public static final okio.Path commonResolve(okio.Path path, okio.ByteString byteString, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteString, "");
        return commonResolve(path, toPath(new okio.Buffer().write(byteString), false), z);
    }

    public static final okio.Path commonResolve(okio.Path path, okio.Buffer buffer, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        return commonResolve(path, toPath(buffer, false), z);
    }

    public static final okio.Path commonResolve(okio.Path path, okio.Path path2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path2, "");
        if (path2.isAbsolute() || path2.volumeLetter() != null) {
            return path2;
        }
        okio.ByteString highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(path);
        if (highSpeedVideoFpsRanges == null && (highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(path2)) == null) {
            highSpeedVideoFpsRanges = getHighSpeedVideoSizes(okio.Path.DIRECTORY_SEPARATOR);
        }
        okio.Buffer buffer = new okio.Buffer();
        buffer.write(path.getBytes());
        if (buffer.size() > 0) {
            buffer.write(highSpeedVideoFpsRanges);
        }
        buffer.write(path2.getBytes());
        return toPath(buffer, z);
    }

    public static final okio.Path commonRelativeTo(okio.Path path, okio.Path path2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path2, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(path.getRoot(), path2.getRoot())) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Paths of different roots cannot be relative to each other: ");
            sb.append(path);
            sb.append(" and ");
            sb.append(path2);
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        java.util.List<okio.ByteString> segmentsBytes = path.getSegmentsBytes();
        java.util.List<okio.ByteString> segmentsBytes2 = path2.getSegmentsBytes();
        int min = java.lang.Math.min(segmentsBytes.size(), segmentsBytes2.size());
        int i = 0;
        while (i < min && kotlin.jvm.internal.Intrinsics.areEqual(segmentsBytes.get(i), segmentsBytes2.get(i))) {
            i++;
        }
        if (i != min || path.getBytes().size() != path2.getBytes().size()) {
            if (segmentsBytes2.subList(i, segmentsBytes2.size()).indexOf(getHighSpeedVideoFpsRangesFor) == -1) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(path2.getBytes(), getHighResolutionOutputSizeshNQ4ISI)) {
                    return path;
                }
                okio.Buffer buffer = new okio.Buffer();
                okio.ByteString highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(path2);
                if (highSpeedVideoFpsRanges == null && (highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(path)) == null) {
                    highSpeedVideoFpsRanges = getHighSpeedVideoSizes(okio.Path.DIRECTORY_SEPARATOR);
                }
                int size = segmentsBytes2.size();
                for (int i2 = i; i2 < size; i2++) {
                    buffer.write(getHighSpeedVideoFpsRangesFor);
                    buffer.write(highSpeedVideoFpsRanges);
                }
                int size2 = segmentsBytes.size();
                while (i < size2) {
                    buffer.write(segmentsBytes.get(i));
                    buffer.write(highSpeedVideoFpsRanges);
                    i++;
                }
                return toPath(buffer, false);
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Impossible relative path to resolve: ");
            sb2.append(path);
            sb2.append(" and ");
            sb2.append(path2);
            throw new java.lang.IllegalArgumentException(sb2.toString().toString());
        }
        return okio.Path.Companion.get$default(okio.Path.INSTANCE, ".", false, 1, (java.lang.Object) null);
    }

    public static final okio.Path commonNormalized(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        return okio.Path.INSTANCE.get(path.toString(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final okio.ByteString getHighSpeedVideoFpsRanges(okio.Path path) {
        okio.ByteString bytes = path.getBytes();
        okio.ByteString byteString = Camera2StreamConfigurationMap;
        if (okio.ByteString.indexOf$default(bytes, byteString, 0, 2, (java.lang.Object) null) != -1) {
            return byteString;
        }
        okio.ByteString bytes2 = path.getBytes();
        okio.ByteString byteString2 = getHighSpeedVideoSizes;
        if (okio.ByteString.indexOf$default(bytes2, byteString2, 0, 2, (java.lang.Object) null) != -1) {
            return byteString2;
        }
        return null;
    }

    public static final int commonCompareTo(okio.Path path, okio.Path path2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path2, "");
        return path.getBytes().compareTo(path2.getBytes());
    }

    public static final boolean commonEquals(okio.Path path, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        return (obj instanceof okio.Path) && kotlin.jvm.internal.Intrinsics.areEqual(((okio.Path) obj).getBytes(), path.getBytes());
    }

    public static final int commonHashCode(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        return path.getBytes().hashCode();
    }

    public static final java.lang.String commonToString(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        return path.getBytes().utf8();
    }

    public static final okio.Path commonToPath(java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return toPath(new okio.Buffer().writeUtf8(str), z);
    }

    public static final okio.Path toPath(okio.Buffer buffer, boolean z) {
        okio.ByteString byteString;
        char c;
        okio.ByteString readByteString;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        okio.Buffer buffer2 = new okio.Buffer();
        okio.ByteString byteString2 = null;
        int i = 0;
        while (true) {
            if (!buffer.rangeEquals(0L, Camera2StreamConfigurationMap)) {
                byteString = getHighSpeedVideoSizes;
                if (!buffer.rangeEquals(0L, byteString)) {
                    break;
                }
            }
            byte readByte = buffer.readByte();
            if (byteString2 == null) {
                byteString2 = getHighSpeedVideoSizes(readByte);
            }
            i++;
        }
        boolean z2 = i >= 2 && kotlin.jvm.internal.Intrinsics.areEqual(byteString2, byteString);
        if (z2) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(byteString2);
            buffer2.write(byteString2);
            buffer2.write(byteString2);
        } else if (i > 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(byteString2);
            buffer2.write(byteString2);
        } else {
            long indexOfElement = buffer.indexOfElement(getHighSpeedVideoFpsRanges);
            if (byteString2 == null) {
                if (indexOfElement == -1) {
                    byteString2 = getHighSpeedVideoSizes(okio.Path.DIRECTORY_SEPARATOR);
                } else {
                    byteString2 = getHighSpeedVideoSizes(buffer.getByte(indexOfElement));
                }
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(byteString2, byteString) && buffer.size() >= 2 && buffer.getByte(1L) == 58 && (('a' <= (c = (char) buffer.getByte(0L)) && c < '{') || ('A' <= c && c < '['))) {
                if (indexOfElement == 2) {
                    buffer2.write(buffer, 3L);
                } else {
                    buffer2.write(buffer, 2L);
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        boolean z3 = buffer2.size() > 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (!buffer.exhausted()) {
            long indexOfElement2 = buffer.indexOfElement(getHighSpeedVideoFpsRanges);
            if (indexOfElement2 == -1) {
                readByteString = buffer.readByteString();
            } else {
                readByteString = buffer.readByteString(indexOfElement2);
                buffer.readByte();
            }
            okio.ByteString byteString3 = getHighSpeedVideoFpsRangesFor;
            if (kotlin.jvm.internal.Intrinsics.areEqual(readByteString, byteString3)) {
                if (!z3 || !arrayList.isEmpty()) {
                    if (!z || (!z3 && (arrayList.isEmpty() || kotlin.jvm.internal.Intrinsics.areEqual(kotlin.collections.CollectionsKt.last((java.util.List) arrayList), byteString3)))) {
                        arrayList.add(readByteString);
                    } else if (!z2 || arrayList.size() != 1) {
                        kotlin.collections.CollectionsKt.removeLastOrNull(arrayList);
                    }
                }
            } else if (!kotlin.jvm.internal.Intrinsics.areEqual(readByteString, getHighResolutionOutputSizeshNQ4ISI) && !kotlin.jvm.internal.Intrinsics.areEqual(readByteString, okio.ByteString.EMPTY)) {
                arrayList.add(readByteString);
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                buffer2.write(byteString2);
            }
            buffer2.write((okio.ByteString) arrayList.get(i2));
        }
        if (buffer2.size() == 0) {
            buffer2.write(getHighResolutionOutputSizeshNQ4ISI);
        }
        return new okio.Path(buffer2.readByteString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final okio.ByteString getHighSpeedVideoSizes(java.lang.String str) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR)) {
            return Camera2StreamConfigurationMap;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, "\\")) {
            return getHighSpeedVideoSizes;
        }
        throw new java.lang.IllegalArgumentException("not a directory separator: ".concat(java.lang.String.valueOf(str)));
    }

    private static final okio.ByteString getHighSpeedVideoSizes(byte b) {
        if (b == 47) {
            return Camera2StreamConfigurationMap;
        }
        if (b == 92) {
            return getHighSpeedVideoSizes;
        }
        throw new java.lang.IllegalArgumentException("not a directory separator: ".concat(java.lang.String.valueOf((int) b)));
    }

    public static final java.util.List<java.lang.String> commonSegments(okio.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int access$rootLength = access$rootLength(path);
        if (access$rootLength == -1) {
            access$rootLength = 0;
        } else if (access$rootLength < path.getBytes().size() && path.getBytes().getByte(access$rootLength) == 92) {
            access$rootLength++;
        }
        int size = path.getBytes().size();
        int i = access$rootLength;
        while (access$rootLength < size) {
            if (path.getBytes().getByte(access$rootLength) == 47 || path.getBytes().getByte(access$rootLength) == 92) {
                arrayList.add(path.getBytes().substring(i, access$rootLength));
                i = access$rootLength + 1;
            }
            access$rootLength++;
        }
        if (i < path.getBytes().size()) {
            arrayList.add(path.getBytes().substring(i, path.getBytes().size()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((okio.ByteString) it.next()).utf8());
        }
        return arrayList3;
    }

    public static final /* synthetic */ int access$getIndexOfLastSlash(okio.Path path) {
        int lastIndexOf$default = okio.ByteString.lastIndexOf$default(path.getBytes(), Camera2StreamConfigurationMap, 0, 2, (java.lang.Object) null);
        return lastIndexOf$default != -1 ? lastIndexOf$default : okio.ByteString.lastIndexOf$default(path.getBytes(), getHighSpeedVideoSizes, 0, 2, (java.lang.Object) null);
    }

    public static final /* synthetic */ boolean access$lastSegmentIsDotDot(okio.Path path) {
        return path.getBytes().endsWith(getHighSpeedVideoFpsRangesFor) && (path.getBytes().size() == 2 || path.getBytes().rangeEquals(path.getBytes().size() + (-3), Camera2StreamConfigurationMap, 0, 1) || path.getBytes().rangeEquals(path.getBytes().size() + (-3), getHighSpeedVideoSizes, 0, 1));
    }

    public static final /* synthetic */ int access$rootLength(okio.Path path) {
        if (path.getBytes().size() != 0) {
            if (path.getBytes().getByte(0) == 47) {
                return 1;
            }
            if (path.getBytes().getByte(0) == 92) {
                if (path.getBytes().size() <= 2 || path.getBytes().getByte(1) != 92) {
                    return 1;
                }
                int indexOf = path.getBytes().indexOf(getHighSpeedVideoSizes, 2);
                return indexOf == -1 ? path.getBytes().size() : indexOf;
            }
            if (path.getBytes().size() > 2 && path.getBytes().getByte(1) == 58 && path.getBytes().getByte(2) == 92) {
                char c = (char) path.getBytes().getByte(0);
                if ('a' <= c && c < '{') {
                    return 3;
                }
                if ('A' <= c && c < '[') {
                    return 3;
                }
            }
        }
        return -1;
    }
}
